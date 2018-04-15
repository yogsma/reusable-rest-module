package com.betterjavacode.socialpie.repositories;

import com.betterjavacode.socialpie.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>
{
}
