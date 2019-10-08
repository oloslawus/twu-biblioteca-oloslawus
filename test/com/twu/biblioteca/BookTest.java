package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookTest {

        Book book1 = new Book("testId", "testTitle", "testYear", "testAuthor");
        Book book2 = new Book("testId2", "testTitle2", "testYear2", "testAuthor2");
        Book book3 = new Book("testId3", "testTitle3", "testYear3", "testAuthor3");


    @Test
    public void customToStringTest(){
        Assert.assertEquals("testId | testTitle | testAuthor | testYear", book1.toString());
    }

    @Test
    public void listOfBooksProperlyCreated(){
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);
        Assert.assertEquals("testId | testTitle | testAuthor | testYear\ntestId2 | testTitle2 | testAuthor2 | testYear2\n", Book.printListOfAvailableBooks(bookList));
    }

}
