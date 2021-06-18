package com.springboot.management_event.services;

import com.springboot.management_event.model.dtos.AccountCreate;
import com.springboot.management_event.model.dtos.AccountLogin;
import com.springboot.management_event.security.IdToken;

public interface AccountService {

    void create(AccountCreate inputs);

    IdToken login(AccountLogin inputs);


    void addRoleByUserName(String username, String roledto);
}
