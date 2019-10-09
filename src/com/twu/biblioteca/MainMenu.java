package com.twu.biblioteca;

import java.util.Scanner;

public class MainMenu {

    public static void showMainMenuOptions() {

        System.out.println("1. List of books");
        System.out.println("2. List of movies");
        System.out.println("3. Show user details");

        chooseOptionFromMainMenu();

    }

    public static void showMainMenuOptionsForLibrarian() {

        System.out.println("1. Show checked out books");
        System.out.println("2. Show checked out movies");
        System.out.println("3. Show user details");
        chooseOptionFromMainMenuForLibrarian();

    }

    private static void chooseOptionFromMainMenuForLibrarian() {
        System.out.println("Please choose what do you want to do next");
        String choice = "0";
        Scanner scan = new Scanner(System.in);
        choice = scan.nextLine();

        if (choice.equals("1")){
            BookListMenu.openCheckedOutBooks();
        } else if (choice.equals("2")){
            MovieListMenu.openCheckedOutMovies();
        } else if (choice.equals("3")){
            UserMenu.showUserInformation();
        } else {
            System.out.println("Please select a valid option!");
            chooseOptionFromMainMenu();
        }
    }

    public static void chooseOptionFromMainMenu(){

        System.out.println("Please choose what do you want to do next");
        String choice = "0";
        Scanner scan = new Scanner(System.in);
        choice = scan.nextLine();

        if (choice.equals("1")){
            BookListMenu.openBookListMenu();
        } else if (choice.equals("2")){
            MovieListMenu.openMovieListMenu();
        } else if (choice.equals("3")){
            UserMenu.showUserInformation();
        } else {
            System.out.println("Please select a valid option!");
            chooseOptionFromMainMenu();
        }

    }
}
