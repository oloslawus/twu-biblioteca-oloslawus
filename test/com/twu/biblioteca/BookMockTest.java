package com.twu.biblioteca;

import org.junit.Test;

public class BookMockTest {

    Book book1 = new Book("testId", "testTitle", "testYear", "testAuthor");
    Book book2 = new Book("testId2", "testTitle2", "testYear2", "testAuthor2");

    @Test
    public void listContainsOnlyAvailableBooks(){
//        Assert.assertEquals(BookMock.createMockBooks().size(), 4);    //HOW TO TEST A METHOD WITHOUT PARAMETERS???
    }
}
