package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class MovieListMenu {

    public static void openBookListMenu(){

        String availableBookList = Book.printListOfAvailableBooks(BookMock.createAvailableBookList());
        System.out.println(availableBookList);
        askUserForAction();
    }

    private static void askUserForAction() {
        System.out.println("If you want to checkout a book, please press C.\n" +
                "If you want to return a book, please press R.\n" +
                "To quit press Q");

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        if(choice.equalsIgnoreCase("R")){
            bookReturn();
        } else if(choice.equalsIgnoreCase("C")){
            bookCheckout();
        } else if(choice.equalsIgnoreCase("Q")){
            return;
        } else{
            System.out.println("An invalid option has been chosen");
        }
        openBookListMenu();

    }

    public static void bookReturn() {

        System.out.println("Please type in the id number of the book you want to return:");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if(isBookPresent(BookMock.allBooks, choice)){
            validateReturn(BookMock.allBooks, choice);
        }else{
            System.out.println("Chosen book doesn't exist");
        }
    }

    public static void bookCheckout() {
        System.out.println("Please type in the id number of the book you want to checkout:");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if(isBookPresent(BookMock.allBooks, choice)){
            validateCheckout(BookMock.allBooks, choice);
        }else{
            System.out.println("Chosen book doesn't exist");
        }
    }

    public static void validateCheckout(List<Book> books, String choice) {
        Book bookToBeRented = books.stream().filter(book -> book.getId().equals(choice)).findFirst().get();
        if (bookToBeRented.getIsRented()){
            System.out.println("Sorry, that book is not available");
        }else{
            bookToBeRented.setIsRented(true);
            System.out.println("Thank you! Enjoy the book!");
        }
    }

    public static void validateReturn(List<Book> books, String choice) {
        Book bookToBeReturned = books.stream().filter(book -> book.getId().equals(choice)).findFirst().get();
        if (!bookToBeReturned.getIsRented()){
            System.out.println("That is not a valid book to return");
        }else{
            bookToBeReturned.setIsRented(false);
            System.out.println("Thank you for returning the book");
        }
    }

    public static boolean isBookPresent(List<Book> books, String choice){
        return books.stream().filter(book -> book.getId().equals(choice)).findFirst().isPresent();

    }
}
