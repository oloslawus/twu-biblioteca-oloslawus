package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookListMenuTest {

    Book book1 = new Book("testId", "testTitle", "testYear", "testAuthor");
    Book book2 = new Book("testId2", "testTitle2", "testYear2", "testAuthor2");

    @Test
    public void isTrueIfBookWithGivenIdExists(){
        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        Assert.assertEquals(true, BookListMenu.isBookPresent(books, "testId"));
    }

    @Test
    public void isFalseIfBookWithGivenIdDoesntExist(){
        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        Assert.assertNotEquals(true, BookListMenu.isBookPresent(books,"blabla"));
    }

    @Test
    public void bookChangesRentalStatusIfChosenAndNotRentedYet(){
        List<Book> books = new ArrayList<Book>();
        book1.setIsRented(false);
        books.add(book1);
        books.add(book2);
        BookListMenu.validateCheckout(books,"testId");
        Assert.assertEquals(true, book1.getIsRented());
    }

    @Test
    public void bookDoesntChangeRentalStatusIfAlreadyRented(){
        List<Book> books = new ArrayList<Book>();
        book1.setIsRented(true);
        books.add(book1);
        books.add(book2);
        BookListMenu.validateCheckout(books,"testId");
        Assert.assertEquals(true, book1.getIsRented());
    }

    @Test
    public void bookChangesRentalStatusIfChosenToReturnAndNotReturnedYet(){
        List<Book> books = new ArrayList<Book>();
        book1.setIsRented(true);
        books.add(book1);
        books.add(book2);
        BookListMenu.validateReturn(books,"testId");
        Assert.assertEquals(false, book1.getIsRented());
    }

    @Test
    public void bookDoesntChangeRentalStatusIfAlreadyReturned(){
        List<Book> books = new ArrayList<Book>();
        book1.setIsRented(false);
        books.add(book1);
        books.add(book2);
        BookListMenu.validateReturn(books,"testId");
        Assert.assertEquals(false, book1.getIsRented());
    }
}
