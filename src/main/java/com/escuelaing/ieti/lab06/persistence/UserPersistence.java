package com.escuelaing.ieti.lab06.persistence;

import com.escuelaing.ieti.lab06.pojos.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserPersistence {


    private List<User> users;

    public UserPersistence() {
        User usuario1 = new User("01", "mora@mail.com", "mora", "mora 1");
        User usuario2 = new User("02", "juan@gmail.com", "juan", "juan 1");
        users = Arrays.asList(usuario1,usuario2);
    }

    public List<User> getAllUsers() {
        return  users;
    }

    public User getUserById(String userId) {

        User userA = null;

        for (User user : users) {
            if( user.getUserId().equals(userId)){
                userA = user;
            }
        }
        return userA;
    }

    public User createUser(User user) throws Exception {
        users.add(user);
        return user;
    }

    public User updateUser(User user) {
        for (User u : users) {
            if( u.getUserId().equals(user.getUserId())){
                u.setEmail(user.getEmail());
                u.setUserName(user.getUserName());
            }
        }
        return user;
    }

    public void removeUser(String userId) {
        for (User user : users) {
            if( user.getUserId().equals(userId)){
                users.remove(user);
            }
        }
    }



}
