package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookTest {

        Book book1 = new Book("testId", "testTitle", "testYear", "testAuthor");
        Book book2 = new Book("testId2", "testTitle2", "testYear2", "testAuthor2");


    @Test
    public void customToStringTest(){
        Assert.assertEquals(book1.toString(), "testId | testTitle | testAuthor | testYear");
    }

    @Test
    public void listOfBooksProperlyCreated(){
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);
        Assert.assertEquals("testId | testTitle | testAuthor | testYear\ntestId2 | testTitle2 | testAuthor2 | testYear2\n", Book.createListOfBooksToPrint(bookList));

    }
}
