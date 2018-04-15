package com.betterjavacode.socialpie.repositories;

import com.betterjavacode.socialpie.models.UserPassword;
import org.springframework.data.repository.CrudRepository;

public interface UserPasswordRepository extends CrudRepository<UserPassword, Integer>
{
}
