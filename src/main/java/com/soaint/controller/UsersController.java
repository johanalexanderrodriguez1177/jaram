package com.soaint.controller;

import com.soaint.entity.Users;
import com.soaint.repository.UsersRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@Api(tags = "ADMIN")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/usuarios/lista")
    @ApiOperation(value = "Usuarios", notes = "Lista de usuarios")
    public List<Users> findAll(){
        return usersRepository.findAll();
    }

}
