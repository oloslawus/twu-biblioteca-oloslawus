package com.twu.biblioteca;

import java.util.ArrayList;

public class Book {

    private String id;
    private String title;
    private String yearPublished;
    private String author;
    private ArrayList<Book> books;

    public Book(String id, String title, String yearPublished, String author) {
        this.id = id;
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    public static void viewListOfBooks() {



    }
}
