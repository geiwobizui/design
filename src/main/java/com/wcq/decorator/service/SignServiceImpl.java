package com.wcq.decorator.service;

public class SignServiceImpl implements SignService {
    @Override
    public ResultMsg register(String username, String password) {
        return new ResultMsg(200,"注册成功",new Member());
    }

    @Override
    public ResultMsg login(String username, String password) {
        return null;
    }
}
