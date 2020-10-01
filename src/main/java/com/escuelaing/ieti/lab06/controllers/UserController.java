package com.escuelaing.ieti.lab06.controllers;

import com.escuelaing.ieti.lab06.pojos.User;
import com.escuelaing.ieti.lab06.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("all")
    public ResponseEntity<?> getAll() {
        try {
            return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>("No users on the database", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") String id) {
        try {
            return new ResponseEntity<>(userService.getById(id), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>("No user exist with this id", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody User newUser) throws Exception {
        User user = userService.create(newUser);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@RequestBody User newUser) {
        User user = userService.update(newUser);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{userId}")
    public ResponseEntity<?> deleteUserById(@PathVariable String userId) {
        userService.remove(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}