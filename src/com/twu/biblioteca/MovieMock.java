package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieMock {

    static List<Movie> allMovies = new ArrayList<Movie>();

    public static void createMockMovies() {

        Movie movie1 = new Movie("1", "Apokalipse now", "1979", "Francis Ford Coppola");
        Movie movie2 = new Movie("2", "Goodfellas", "1990", "Martin Scorsese");
        Movie movie3 = new Movie("3", "The Shining", "1980", "Stanley Kubrick");
        Movie movie4 = new Movie("4", "Night at the Museum", "1980", "Shawn Levy");

        movie3.setIsRented(true);
        allMovies.add(movie1);
        allMovies.add(movie2);
        allMovies.add(movie3);
        allMovies.add(movie4);

    }

    public static List<Movie> createAvailableMovieList(){

        return allMovies.stream().filter(book -> book.getIsRented().equals(false)).collect(Collectors.toList());
    }
}
