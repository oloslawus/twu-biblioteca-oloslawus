package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MockUser {

    public static List<User> userList = new ArrayList<User>();

    public static void createUserList(){

        User user1 = new User("1", "marta","marta123", "Marta", "Kruszynska",Role.LIBRARIAN, "marta@op.pl");
        User user2 = new User("2", "ola","ola123", "Ola", "Zyto",Role.USER, "ola@op.pl");
        User user3 = new User("3", "tomek","tomek123", "Tokmek", "Liberski",Role.USER, "tomek@op.pl");

        userList.add(user1);
        userList.add(user3);
        userList.add(user2);
    }

}
