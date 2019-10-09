package com.twu.biblioteca;

public class Movie implements Rentable{

    private String id;
    private String name;
    private String year;
    private String director;
    private Integer rating;

    public Movie(String id, String name, String year, String director) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
    }


}
