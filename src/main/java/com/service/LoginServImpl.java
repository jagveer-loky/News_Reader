package com.service;

import com.dao.LoginDao;
import com.dto.LoginDto;

public class LoginServImpl implements LoginServ {

    LoginDao ld;

    public LoginServImpl(LoginDao ld) {
        this.ld = ld;
    }

    @Override
    public String loginMember(LoginDto ld) {
        return null;
    }
}
