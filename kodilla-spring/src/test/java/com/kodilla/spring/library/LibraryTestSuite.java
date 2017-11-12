package com.kodilla.spring.library;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryTestSuite {

    //0 - Wstrzykiwanie zależności przez konstruktor
    @Test
    public void testLoadFromDb(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //When
        library.loadFromDb();
        //Then
        //do nothing
    }
    @Test
    public void testSaveToDb(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //When
        library.saveToDb();
        //Then
        //do nothing
    }

    //1 - Wstrzykiwanie zależności przy pomocy metody
    @Test
    public void testLoadFromDb_1(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library1 library1 = context.getBean(Library1.class);
        //When
        library1.loadFromDb();
        //Then
        //do nothing
    }
    @Test
    public void testSaveToDb_1(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library1 library1 = context.getBean(Library1.class);
        //When
        library1.saveToDb();
        //Then
        //do nothing
    }

    //2 - Wstrzykiwanie zależności do właściwości klasy
    @Test
    public void testLoadFromDb_2(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library2 library2 = context.getBean(Library2.class);
        //When
        library2.loadFromDb();
        //Then
        //do nothing
    }
    @Test
    public void testSaveToDb_2(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library2 library2 = context.getBean(Library2.class);
        //When
        library2.saveToDb();
        //Then
        //do nothing
    }
}
