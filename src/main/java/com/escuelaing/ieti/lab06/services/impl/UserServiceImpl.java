package com.escuelaing.ieti.lab06.services.impl;

import com.escuelaing.ieti.lab06.persistence.UserPersistence;
import com.escuelaing.ieti.lab06.pojos.User;
import com.escuelaing.ieti.lab06.services.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserPersistence userP = new UserPersistence();

    @Override
    public List<User> getAll() {
        return userP.getAllUsers();
    }

    @Override
    public User getById(String userId) {
        return userP.getUserById(userId);
    }

    @Override
    public User create(User user) throws Exception {
        return userP.createUser(user);
    }

    @Override
    public User update(User user) {
        return userP.updateUser(user);
    }

    @Override
    public void remove(String userId) {
        userP.removeUser(userId);
    }
}
