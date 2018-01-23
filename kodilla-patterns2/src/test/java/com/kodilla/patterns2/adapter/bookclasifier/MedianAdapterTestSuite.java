package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void getMedianPpublicationYearTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("some author 1 ", "some book 1",1990,"00001"));
        books.add(new Book("some author 2 ", "some book 2",2000,"00002"));
        books.add(new Book("some author 3 ", "some book 3",2017,"00003"));
        books.add(new Book("some author 4 ", "some book 4",2018,"00004"));
        books.add(new Book("some author 5 ", "some book 5",1982,"00005"));
        books.add(new Book("some author 5 ", "some book 5",1977,"00006"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        System.out.println("The median of books publication year is: " + median);
        Assert.assertEquals(2000,median);
    }

}