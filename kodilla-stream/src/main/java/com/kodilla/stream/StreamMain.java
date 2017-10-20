package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Forum;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        BookDirectory bookDirectory = new BookDirectory();
        String theResultStringOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication()>2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        //zadanie 7.3.
        Forum forum = new Forum();
        Map<Integer,ForumUser> theResultMapOfForumUser = forum.getUserList().stream()
                .filter(user -> user.getUserSex() == 'M' )
                .filter(user -> user.getDateOfBirth().getYear()<=1997)
                .filter(user -> user.getPublishedPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("\nNumber of elements: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .forEach(System.out::println);
    }

}
