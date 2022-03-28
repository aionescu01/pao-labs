package com.company.entities;

public class User {
    //user care are persoana si date de login si rol
    private Person user_details;
    private String username;
    private String password;
    private String role;

    public User(){}

    public User(Person user_details, String username, String password, String role) {
        this.user_details = user_details;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Person getUser_details() {
        return user_details;
    }

    public void setUser_details(Person user_details) {
        this.user_details = user_details;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
