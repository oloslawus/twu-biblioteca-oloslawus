package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BookListMenu {

    public static void openBookListMenu(){
        System.out.println(Book.printListOfAvailableBooks(BookMock.createMockBooks()));
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
        askUserForAction();

    }

    public static void bookReturn() {

        System.out.println("Please type in the id number of the book you want to return:");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if(isBookPresent(BookMock.books, choice)){
            validateReturn(BookMock.books, choice);
        }else{
            System.out.println("Chosen book doesn't exist");
        }
    }

    public static void bookCheckout() {
        System.out.println("Please type in the id number of the book you want to checkout:");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if(isBookPresent(BookMock.books, choice)){
            validateCheckout(BookMock.books, choice);
        }else{
            System.out.println("Chosen book doesn't exist");
        }
    }

    public static void validateCheckout(List<Book> books, String choice) {
        Book bookToBeRented = books.stream().filter(book -> book.getId().equals(choice)).findFirst().get();
        if (bookToBeRented.getIsRented()){
            System.out.println("The book you have chosen is already rented");
        }else{
            bookToBeRented.setIsRented(true);
            System.out.println("You have successfully checked out the book titled "+bookToBeRented.getTitle());
        }
    }

    public static void validateReturn(List<Book> books, String choice) {
        Book bookToBeReturned = books.stream().filter(book -> book.getId().equals(choice)).findFirst().get();
        if (!bookToBeReturned.getIsRented()){
            System.out.println("The book you have chosen is already returned");
        }else{
            bookToBeReturned.setIsRented(false);
            System.out.println("You have successfully returned out the book titled "+bookToBeReturned.getTitle());
        }
    }

    public static boolean isBookPresent(List<Book> books, String choice){
        return books.stream().filter(book -> book.getId().equals(choice)).findFirst().isPresent();

    }

}
