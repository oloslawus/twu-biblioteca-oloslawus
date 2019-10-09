package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class BookMockTest {

//    Book book1 = new Book("testId", "testTitle", "testYear", "testAuthor");
//    Book book2 = new Book("testId2", "testTitle2", "testYear2", "testAuthor2");

    @Test
    public void listContainsOnlyAvailableBooks(){
        List<Book> books = BookMock.createAvailableBookList();


    }
}
