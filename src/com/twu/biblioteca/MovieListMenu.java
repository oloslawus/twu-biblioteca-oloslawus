package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class MovieListMenu {

    public static void openMovieListMenu(){

        String availableItemList = Movie.printListOfAvailableMovies(MovieMock.createAvailableMovieList());
        System.out.println(availableItemList);
        askUserForAction();
    }

    private static void askUserForAction() {
        System.out.println("If you want to checkout an item, please press C.\n" +
                "If you want to return an item, please press R.\n" +
                "To quit press Q");

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        if(choice.equalsIgnoreCase("R")){
            movieReturn();
        } else if(choice.equalsIgnoreCase("C")){
            movieCheckout();
        } else if(choice.equalsIgnoreCase("Q")){
            return;
        } else{
            System.out.println("An invalid option has been chosen");
        }
        openMovieListMenu();

    }

    public static void movieReturn() {

        System.out.println("Please type in the id number of the movie you want to return:");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if(isMoviePresent(MovieMock.allMovies, choice)){
            validateReturn(MovieMock.allMovies, choice);
        }else{
            System.out.println("Chosen movie doesn't exist");
        }
    }

    public static void movieCheckout() {
        System.out.println("Please type in the id number of the movie you want to checkout:");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if(isMoviePresent(MovieMock.allMovies, choice)){
            validateCheckout(MovieMock.allMovies, choice);
        }else{
            System.out.println("Chosen book doesn't exist");
        }
    }

    public static void validateCheckout(List<Movie> movies, String choice) {
        Movie movieToBeRented = movies.stream().filter(movie -> movie.getId().equals(choice)).findFirst().get();
        if (movieToBeRented.getIsRented()){
            System.out.println("Sorry, that movie is not available");
        }else{
            movieToBeRented.setIsRented(true);
            System.out.println("Thank you! Enjoy the movie!");
        }
    }

    public static void validateReturn(List<Movie> movies, String choice) {
        Movie movieToBeReturned = movies.stream().filter(movie -> movie.getId().equals(choice)).findFirst().get();
        if (!movieToBeReturned.getIsRented()){
            System.out.println("That is not a valid movie to return");
        }else{
            movieToBeReturned.setIsRented(false);
            System.out.println("Thank you for returning the movie");
        }
    }

    public static boolean isMoviePresent(List<Movie> movies, String choice){
        return movies.stream().filter(movie -> movie.getId().equals(choice)).findFirst().isPresent();

    }

}
