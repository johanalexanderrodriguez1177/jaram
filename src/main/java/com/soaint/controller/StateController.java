package com.soaint.controller;

import com.soaint.entity.State;
import com.soaint.repository.StateRepository;
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
public class StateController {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping("/estado/lista")
    @ApiOperation(value = "Estados", notes = "Lista de estados")
    public List<State> findAll(){
        return stateRepository.findAll();
    }

}
