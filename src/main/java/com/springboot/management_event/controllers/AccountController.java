package com.springboot.management_event.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.*;

import com.springboot.management_event.model.dtos.AccountCreate;
import com.springboot.management_event.model.dtos.AccountLogin;
import com.springboot.management_event.security.IdToken;
import com.springboot.management_event.services.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@Valid @RequestBody AccountCreate inputs) {

        service.create(inputs);
    }

    @PostMapping("/login")
    public IdToken login(@Valid @RequestBody AccountLogin inputs) {
        return service.login(inputs);
    }

    @GetMapping("/ressource")
    public String myressource() {

        return "je suis ton secret ressource";
    }






}
