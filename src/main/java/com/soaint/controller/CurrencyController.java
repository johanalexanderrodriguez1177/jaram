package com.soaint.controller;

import com.soaint.entity.Currency;
import com.soaint.repository.CurrencyRepository;
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
public class CurrencyController {

    @Autowired
    private CurrencyRepository currencyRepository;

    @GetMapping("/monedas/lista")
    @ApiOperation(value = "Monedas", notes = "Lista de monedas")
    public List<Currency> findAll(){
        return currencyRepository.findAll();
    }

}