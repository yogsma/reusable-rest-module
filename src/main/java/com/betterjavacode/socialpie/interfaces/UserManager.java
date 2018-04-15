package com.betterjavacode.socialpie.interfaces;

import com.betterjavacode.socialpie.models.User;

import java.util.List;

public interface UserManager
{
    User createUser(User user);

    User updateUser(User user);

    List<User> getAllUsers();

    User getUser(String guid);

    void deleteUser(String guid);
}
