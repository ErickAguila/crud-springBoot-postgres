package com.aguila.crudpostgres.repository;

import com.aguila.crudpostgres.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserCrudRepository extends JpaRepository<User, Integer> {
}
