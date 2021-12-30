package com.service;

import com.dto.LoginDto;
import org.springframework.stereotype.Service;

public interface LoginServ {

    String loginMember(LoginDto ld);

}
