package com.twu.biblioteca;

import static java.util.concurrent.TimeUnit.*;

public class BibliotecaApp {

    public static void main(String[] args) throws InterruptedException {

        showWelcomeMessage();

    }

    public static void showWelcomeMessage() throws InterruptedException {

        System.out.println("Hello! \nWelcome to Bangalore Public Library Management System");
        MILLISECONDS.sleep(3000);
        MainMenu.showMainMenuOptions();

    }


}