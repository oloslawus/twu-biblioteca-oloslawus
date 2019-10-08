package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookMock {

    public static List<Book> createMockData() {
        Book book1 = new Book("1", "A man", "1979", "Oriana Fellaci");
        Book book2 = new Book("2", "The plague", "1947", "Albert Camus");
        Book book3 = new Book("3", "Akademia Pana Kleksa", "1946", "Jan Brzechwa");
        Book book4 = new Book("4", "Blindness", "1995", "Jose Saramago");

        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        return books;
    }
}
