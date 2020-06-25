package com.soaint.controller;


import com.soaint.entity.StaCivil;
import com.soaint.repository.StaCivilRepository;
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
public class StaCivilController {

    @Autowired
    private StaCivilRepository staCivilRepository;

    @GetMapping("/estadocivil/lista")
    @ApiOperation(value = "Estado civil", notes = "Lista de estado civil")
    public List<StaCivil> findAll(){
        return staCivilRepository.findAll();
    }

}
