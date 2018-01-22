package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYaer(Map<BookSignature,Book> books);
    int medianPublicationYaer(Map<BookSignature,Book> books);
}
