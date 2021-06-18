package com.springboot.management_event.controllers;

import com.springboot.management_event.model.dtos.AddRoleDTO;
import com.springboot.management_event.services.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tests")
public class TestController {


    private final AccountService accountService;

    public TestController(AccountService accountService) {
        this.accountService = accountService;
    }


    @GetMapping("/anonymous-only")
    public String anonymousOnly() {
        return "I am an anonymous user!";
    }

    @GetMapping("/basic-only")
    public String basicOnly() {
        return "I am a basic user!";
    }

    @GetMapping("/admin-only")
    public String adminOnly() {
        return "I am an admin user!";
    }

    @GetMapping("/manager-only")
    public String managerOnly() {
        return "I am an manager user!";
    }


    @GetMapping("/manager-admin-only")
    public String managerAdminOnly() {
        return "we are manager and admin users!";
    }



    @PostMapping("/changerole")
    public String addRole(@RequestBody AddRoleDTO dto){

        String email = dto.getUsername();
        String role = dto.getRole();
        accountService.addRoleByUserName(email,role);

        return " Your role added";
    }

}
