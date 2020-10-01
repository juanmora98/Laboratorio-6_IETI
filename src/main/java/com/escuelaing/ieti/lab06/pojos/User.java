package com.escuelaing.ieti.lab06.pojos;

public class User {

    //Atributos
    private String userId;
    private String userName;
    private String password;
    private String email;


    public User (String id, String email, String password, String name) {
        this.userId = id;
        this.email = email;
        this.password = password;
        this.userName = name;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
