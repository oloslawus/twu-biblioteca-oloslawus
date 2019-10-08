package com.twu.biblioteca;

import java.util.Scanner;

public class MainMenu {

    public static void showMainMenuOptions() {

        System.out.println("1. List of books");
        chooseOptionFromMainMenu();

    }

    public static void chooseOptionFromMainMenu(){

        System.out.println("Please choose what do you want to do next");
        String choice = "0";
        Scanner scan = new Scanner(System.in);
        choice = scan.nextLine();

        if (choice.equals("1")){
            BookListMenu.openBookListMenu();
        } else {
            System.out.println("Please select a valid option!");
            chooseOptionFromMainMenu();
        }

    }
}
