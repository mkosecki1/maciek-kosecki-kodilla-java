package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYaer(Map<BookSignature, Book> books) {
        Statistics theStatistics = new Statistics();
        return theStatistics.averagePublicationYaer(books);
    }

    @Override
    public int medianPublicationYaer(Map<BookSignature, Book> books) {
        Statistics theStatistics = new Statistics();
        return theStatistics.medianPublicationYaer(books);
    }
}
