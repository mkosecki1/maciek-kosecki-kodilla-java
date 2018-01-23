package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int getAveragePublicationYaer(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.getAveragePublicationYaer(books);
    }

    @Override
    public int getMedianPublicationYaer(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.getMedianPublicationYaer(books);
    }
}
