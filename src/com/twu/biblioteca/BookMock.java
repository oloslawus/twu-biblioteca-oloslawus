package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookMock {

    static List<Book> allBooks = new ArrayList<Book>();

    public static void createMockBooks() {

        Book book1 = new Book("1", "A man", "1979", "Oriana Fellaci");
        Book book2 = new Book("2", "The plague", "1947", "Albert Camus");
        Book book3 = new Book("3", "Akademia Pana Kleksa", "1946", "Jan Brzechwa");
        Book book4 = new Book("4", "Blindness", "1995", "Jose Saramago");

        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);

    }

    public static List<Book> createAvailableBookList(){

        return allBooks.stream().filter(book -> book.getIsRented().equals(false)).collect(Collectors.toList());
    }

}
