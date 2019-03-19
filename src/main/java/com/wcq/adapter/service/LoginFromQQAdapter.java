package com.wcq.adapter.service;

public class LoginFromQQAdapter implements LoginAdapter {
    @Override
    public boolean support(LoginAdapter adapter) {
        return adapter instanceof LoginFromQQAdapter;
    }

    @Override
    public ResultMsg login(String username, LoginAdapter adapter) {
        return null;
    }
}
