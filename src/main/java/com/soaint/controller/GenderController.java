package com.soaint.controller;

import com.soaint.entity.Gender;
import com.soaint.repository.GenderRepository;
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
public class GenderController {

    @Autowired
    private GenderRepository genderRepository;

    @GetMapping("/genero/lista")
    @ApiOperation(value = "Generos", notes = "Lista de generos")
    public List<Gender> findAll(){
        return genderRepository.findAll();
    }
}
