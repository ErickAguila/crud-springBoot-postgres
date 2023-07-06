package com.aguila.crudpostgres.service;

import com.aguila.crudpostgres.dto.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> getAll();
}
