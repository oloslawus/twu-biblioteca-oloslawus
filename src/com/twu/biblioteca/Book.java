package com.twu.biblioteca;

import java.util.List;

public class Book {

    private String id;
    private String title;
    private String yearPublished;
    private String author;
    private Boolean isRented;

    public Book(String id, String title, String yearPublished, String author) {
        this.id = id;
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
        this.isRented = false;
    }

    public void setIsRented(Boolean isRented) {
        this.isRented = isRented;
    }

    public String getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public Boolean getIsRented() {
        return isRented;
    }

    public static String printListOfAvailableBooks(List<Book> books) {

        StringBuilder stringBuilder = new StringBuilder();

        for(Book book : books){
            stringBuilder.append(book.toString()+"\n");
        }

        return stringBuilder.toString();

    }

    @Override
    public String toString() {
        return this.id+" | "+this.title+" | "+this.author+" | "+this.yearPublished;
    }


}
