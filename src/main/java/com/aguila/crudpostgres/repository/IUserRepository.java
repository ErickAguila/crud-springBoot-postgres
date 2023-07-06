package com.aguila.crudpostgres.repository;

import com.aguila.crudpostgres.entity.User;

import java.util.List;

public interface IUserRepository {
    List<User> getAll();
}
