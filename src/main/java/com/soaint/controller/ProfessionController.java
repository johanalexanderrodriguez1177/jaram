package com.soaint.controller;

import com.soaint.entity.Profession;
import com.soaint.repository.ProfessionRepository;
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
public class ProfessionController {

    @Autowired
    private ProfessionRepository professionRepository;

    @GetMapping("/profesion/lista")
    @ApiOperation(value = "Profesiones", notes = "Lista de profesiones")
    public List<Profession> findAll(){
        return professionRepository.findAll();
    }

}
