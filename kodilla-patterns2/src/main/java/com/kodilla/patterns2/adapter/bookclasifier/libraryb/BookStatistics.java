package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int getAveragePublicationYaer(Map<BookSignature,Book> books);
    int getMedianPublicationYaer(Map<BookSignature,Book> books);
}
