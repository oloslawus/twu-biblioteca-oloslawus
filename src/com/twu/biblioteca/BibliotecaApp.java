package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

import static java.util.concurrent.TimeUnit.*;

public class BibliotecaApp {

    public static void main(String[] args) throws InterruptedException {

        Book book1 = new Book("1", "A man", "1979", "Oriana Fellaci");

        System.out.println(book1.toString());
        showWelcomeMessage();

    }

    public static void showWelcomeMessage() throws InterruptedException {

        System.out.println("Hello! \nWelcome to Bangalore Public Library Management System");
        MILLISECONDS.sleep(3000);
        MainMenu.showMainMenuOptions();

    }


}