package com.escuelaing.ieti.lab06.services.interfaces;

import com.escuelaing.ieti.lab06.pojos.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(String userId);

    User create(User user) throws Exception;

    User update(User user);

    void remove(String userId);

}
