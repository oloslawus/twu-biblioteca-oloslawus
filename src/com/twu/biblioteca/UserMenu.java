package com.twu.biblioteca;

public class UserMenu {

    public static void showUserInformation(){
        User user = LoginService.loggedUser;
        System.out.println(user.toString());
        if(user.getRole().equals(Role.USER)){
            MainMenu.showMainMenuOptions();
        }else{
            MainMenu.showMainMenuOptionsForLibrarian();
        }
    }
}
