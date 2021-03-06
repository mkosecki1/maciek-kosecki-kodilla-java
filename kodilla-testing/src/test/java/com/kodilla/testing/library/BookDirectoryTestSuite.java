package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionsReturnList() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4,theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<>();
        for (int n=0; n<booksQuantity; n++){
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }


    @Test
    public void testListBooksWithConditionMoreThan20(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");

        //Given
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);

        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        Assert.assertEquals(0,theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    //Exercise 6.6.
    @Test
    public void testListBooksInHandsOfZero(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Maciek", "Kosecki","12345678912");
        List<Book> resultBooksInHandsOfZero = new ArrayList<Book>();

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultBooksInHandsOfZero);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        Assert.assertEquals(0,theListOfBooks0.size());
    }

    @Test
    public void testListBooksInHandsOfOne(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUser = new LibraryUser("Maciek", "Kosecki","12345678912");
        List<Book> resultBooksInHandsOfOne = new ArrayList<>();
        resultBooksInHandsOfOne.add(new Book("titleOne", "AuthorOne", 2017));

        when(libraryDatabase.listBooksInHandsOf(libraryUser)).thenReturn(resultBooksInHandsOfOne);

        //When
        List<Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        Assert.assertEquals(1,theListOfBooks1.size());
    }
    @Test
    public void testListBooksInHandsOfFive(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUser = new LibraryUser("Maciek", "Kosecki","12345678912");
        List<Book> resultBooksInHandsOfFive = generateListOfNBooks(5);

        when(libraryDatabase.listBooksInHandsOf(libraryUser)).thenReturn(resultBooksInHandsOfFive);

        //When
        List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        Assert.assertEquals(5, theListOfBooks5.size());
    }
}
