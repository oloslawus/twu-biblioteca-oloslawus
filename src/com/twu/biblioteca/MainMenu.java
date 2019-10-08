package com.twu.biblioteca;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {

    public static void showMainMenuOptions() throws IOException {

        System.out.println("List of books");

        String choice = "0";
        Scanner scan = new Scanner(System.in);
        choice = scan.nextLine();

        if (choice.equals("1")){
            Book.viewListOfBooks();
        } else {
            System.out.println("Please enter the number of the option you want to choose");
        }
    }
}
