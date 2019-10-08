package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

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


    public static String createListOfBooksToPrint(List<Book> books) {

        StringBuilder stringBuilder = new StringBuilder();

        for (Book book : books){
            stringBuilder.append(book.toString()+"\n");
        }

        return stringBuilder.toString();

    }

    @Override
    public String toString() {
        return this.id+" | "+this.title+" | "+this.author+" | "+this.yearPublished;
    }
}
