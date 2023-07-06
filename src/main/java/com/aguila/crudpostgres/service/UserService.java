package com.aguila.crudpostgres.service;

import com.aguila.crudpostgres.dto.UserDTO;
import com.aguila.crudpostgres.entity.User;
import com.aguila.crudpostgres.mapper.UserMapper;
import com.aguila.crudpostgres.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class UserService implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserDTO> getAll() {
        List<User> users = iUserRepository.getAll();
        return users.stream().map(userMapper::convertEntitytoDTO).toList();
    }
}
