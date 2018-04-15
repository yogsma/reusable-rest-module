package com.betterjavacode.socialpie.managers;

import com.betterjavacode.socialpie.interfaces.UserManager;
import com.betterjavacode.socialpie.models.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author - Yogesh Mali
 */
@Component
public class UserManagerImpl implements UserManager
{
    @Override
    public User createUser(User user)
    {
        return null;
    }

    @Override
    public User updateUser(User user)
    {
        return null;
    }

    @Override
    public List<User> getAllUsers()
    {
        return null;
    }

    @Override
    public User getUser(String guid)
    {
        return null;
    }

    @Override
    public void deleteUser(String guid)
    {

    }
}
