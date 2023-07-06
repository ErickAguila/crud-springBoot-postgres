package com.aguila.crudpostgres.repository;

import com.aguila.crudpostgres.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository implements  IUserRepository{

    @Autowired
    private IUserCrudRepository iUserCrudRepository;

    public List<User> getAll() { return iUserCrudRepository.findAll(); }

}
