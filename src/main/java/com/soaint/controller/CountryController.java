package com.soaint.controller;


import com.soaint.entity.Country;
import com.soaint.repository.CountryRepository;
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
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/pais/lista")
    @ApiOperation(value = "Países", notes = "Lista de países")
    public List<Country> findAll(){
        return countryRepository.findAll();
    }

}