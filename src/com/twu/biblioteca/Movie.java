package com.twu.biblioteca;

import java.util.List;

public class Movie {

    private String id;
    private String name;
    private String year;
    private String director;
    private Integer rating;
    private Boolean isRented;

    public Movie(String id, String name, String year, String director) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.isRented = false;
    }

    public Movie(String id, String name, String year, String director, Integer rating) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.isRented = false;

    }

    public static String printListOfAvailableMovies(List<Movie> movies) {

        StringBuilder stringBuilder = new StringBuilder();

        for(Movie movie : movies){
            stringBuilder.append(movie.toString()+"\n");
        }

        return stringBuilder.toString();

    }

    public void setIsRented(Boolean isRented) {
        this.isRented = isRented;
    }

    public String getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public Boolean getIsRented() {
        return isRented;
    }

    @Override
    public String toString() {
        return this.id+" | "+this.name+" | "+this.director+" | "+this.year;
    }


}
