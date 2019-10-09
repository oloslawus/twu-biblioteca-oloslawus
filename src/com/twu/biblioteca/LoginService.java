package com.twu.biblioteca;

import java.util.Optional;
import java.util.Scanner;

public class LoginService {

    static User loggedUser = null;
    static Scanner scanner = new Scanner(System.in);

    public static void openLoginMenu(){
        System.out.println("Please insert your username and password separated by space and press Enter");
        findUser(scanner.nextLine());
    }

    private static void findUser(String usernameAndPassword) {
        Optional userToBeLoggedIn =
                MockUser.userList.stream().filter(user -> user.getUsername().equals(usernameAndPassword.split("\\s+")[0])).findFirst();
        if(userToBeLoggedIn.isPresent()){
            login(usernameAndPassword,
                    MockUser.userList.stream().filter(user -> user.getUsername().equals(usernameAndPassword.split("\\s+")[0])).findFirst().get());
        }else{
            openLoginMenu();
        }
    }

    private static void login(String usernameAndPassword, User userToBeLoggedIn) {

        Boolean usernameCorrect = userToBeLoggedIn.getUsername().equals(usernameAndPassword.split("\\s+")[0]);
        Boolean passwordCorrect = userToBeLoggedIn.getPassword().equals(usernameAndPassword.split("\\s+")[1]);

        loggedUser = (usernameCorrect && passwordCorrect)?(userToBeLoggedIn):(null);

    }
}