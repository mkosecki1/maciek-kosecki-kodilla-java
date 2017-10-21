package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Map;
import java.util.stream.Collectors;

//Dla zadań 7.1. i 7.2

public class CopyOfStreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a - b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a * b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("\nfirst poem", (word)->word.toUpperCase());
        poemBeautifier.beautify("first poem", (k) -> "ABC" +" "+k);
        poemBeautifier.beautify("first poem", (ko) -> "ABC");
        poemBeautifier.beautify("SECEND POEM", (ok) -> ok + " ABC");
        poemBeautifier.beautify("SECEND POEM", (kk) -> kk.toLowerCase());
        poemBeautifier.beautify("Another poem", (k) -> k + " ABC " + k);

        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        People.getList().stream()
                .map(s -> s.toUpperCase())  //może też być:  .map(String::toUpperCase)
                .filter(s -> s.length()>11) // UWAGA nie można użyć (String::lenght>11) !!
                .map(s -> s.substring(0,s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);  //może też być:  .forEach(s -> System.out.println(s));

        BookDirectory bookDirectory = new BookDirectory();
        Map<String,Book> theResultMapOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication()>2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));
        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


    }
}
