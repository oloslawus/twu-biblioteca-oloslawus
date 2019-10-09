package com.twu.biblioteca;

import static java.util.concurrent.TimeUnit.*;

public class BibliotecaApp {

    public static void main(String[] args) throws InterruptedException {

        BookMock.createMockBooks();
        MovieMock.createMockMovies();
        showWelcomeMessage();

    }

    public static void showWelcomeMessage() throws InterruptedException {


        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        MILLISECONDS.sleep(3000);
        MainMenu.showMainMenuOptions();

    }


}