package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MovieListMenuTest {

    String idOfMovieToBeTested = "testId";
    Movie movie1 = new Movie(idOfMovieToBeTested, "testTitle", "testYear", "testDirector");
    Movie movie2 = new Movie("testId2", "testTitle2", "testYear2", "testDirector2");

    @Test
    public void isTrueIfMovieWithGivenIdExists(){
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(movie1);
        movies.add(movie2);
        Assert.assertEquals(true, MovieListMenu.isMoviePresent(movies, idOfMovieToBeTested));
    }

    @Test
    public void isFalseIfMovieWithGivenIdDoesntExist(){
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(movie1);
        movies.add(movie2);
        Assert.assertNotEquals(true, MovieListMenu.isMoviePresent(movies,"blabla"));
    }

    @Test
    public void movieChangesRentalStatusIfChosenAndNotRentedYet(){
        List<Movie> movies = new ArrayList<Movie>();
        movie1.setIsRented(false);
        movies.add(movie1);
        movies.add(movie2);
        MovieListMenu.validateCheckout(movies,idOfMovieToBeTested);
        Assert.assertEquals(true, movie1.getIsRented());
    }

    @Test
    public void movieDoesntChangeRentalStatusIfAlreadyRented(){
        List<Movie> movies = new ArrayList<Movie>();
        movie1.setIsRented(true);
        movies.add(movie1);
        movies.add(movie2);
        MovieListMenu.validateCheckout(movies,idOfMovieToBeTested);
        Assert.assertEquals(true, movie1.getIsRented());
    }

    @Test
    public void movieChangesRentalStatusIfChosenToReturnAndNotReturnedYet(){
        List<Movie> movies = new ArrayList<Movie>();
        movie1.setIsRented(true);
        movies.add(movie1);
        movies.add(movie2);
        MovieListMenu.validateReturn(movies,idOfMovieToBeTested);
        Assert.assertEquals(false, movie1.getIsRented());
    }

    @Test
    public void movieDoesntChangeRentalStatusIfAlreadyReturned(){
        List<Movie> movies = new ArrayList<Movie>();
        movie1.setIsRented(false);
        movies.add(movie1);
        movies.add(movie2);
        MovieListMenu.validateReturn(movies,idOfMovieToBeTested);
        Assert.assertEquals(false, movie1.getIsRented());
    }
}
