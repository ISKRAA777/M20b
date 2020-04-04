package com.M20.M20b.adapter.bookclasifier;

import com.M20.M20b.adapter.bookclasifier.librarya.Classifier;
import com.M20.M20b.adapter.bookclasifier.libraryb.BookSignature;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.M20.M20b.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, com.M20.M20b.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();
        for (com.M20.M20b.adapter.bookclasifier.librarya.Book book : bookSet) {
            com.M20.M20b.adapter.bookclasifier.libraryb.Book bookB =
                    new com.M20.M20b.adapter.bookclasifier.libraryb
                            .Book(book.getAuthor(), book.getTitle(), book.getPublicationYear());
            bookMap.put(new BookSignature(book.getSignature()), bookB);
        }
        return medianPublicationYear(bookMap);
    }
}

