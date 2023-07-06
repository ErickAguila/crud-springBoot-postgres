package com.aguila.crudpostgres.controller;

import com.aguila.crudpostgres.dto.UserDTO;
import com.aguila.crudpostgres.service.IUserService;
import com.aguila.crudpostgres.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class UserController {

    private final IUserService iUserService;

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> getAll() {
        return new ResponseEntity<>(iUserService.getAll(), HttpStatus.OK);
    }
}
