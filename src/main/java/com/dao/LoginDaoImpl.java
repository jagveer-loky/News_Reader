package com.dao;

import com.dto.LoginDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {

    private final SqlSession ss;

    public LoginDaoImpl(SqlSession ss) {
        this.ss = ss;
    }

    String ns = "login.";

    @Override
    public String loginMember(LoginDto ldt) {
        return ldt.getUserId();
    }

}
