package com.M20.M20b.adapter.bookclassifier;


import com.M20.M20b.adapter.bookclasifier.MedianAdapter;
import com.M20.M20b.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("A1", "T1", 2008, "001");
        Book book2 = new Book("A1", "T2", 2003, "002");
        Book book3 = new Book("A1", "T3", 2000, "003");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedia = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2003, publicationYearMedia, 0);
    }
}
