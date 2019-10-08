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
                "If you want to return a book, please press R.");

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        if(choice.equals("R")){
            bookReturn();
        } else if(choice.equals("C")){
            bookCheckout();
        }else{
            System.out.println("An invalid option has been chosen");
            askUserForAction();
        }
    }

    public static void bookReturn() {

    }

    public static void bookCheckout() {
    }

    public static boolean isBookPresent(List<Book> books, String choice){
        return books.stream().filter(book -> book.getId().equals(choice)).findFirst().isPresent();

    }
}
