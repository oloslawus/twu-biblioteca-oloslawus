package com.twu.biblioteca;

public class User {

    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lasttName;
    private Role role;
    private String email;

    public User(String id, String username, String password, String firstName, String lasttName, Role role, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.role = role;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }
}
