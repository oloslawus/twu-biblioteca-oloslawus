package com.twu.biblioteca;

import java.util.Scanner;

public class MainMenu {

    public static void showMainMenuOptions() {

        System.out.println("1. List of books");

        String choice = "0";
        Scanner scan = new Scanner(System.in);
        choice = scan.nextLine();

        if (choice.equals("1")){
            BookListMenu.openBookListMenu();
        } else {
            System.out.println("Please enter the number of the option you want to choose");
        }
    }
}
