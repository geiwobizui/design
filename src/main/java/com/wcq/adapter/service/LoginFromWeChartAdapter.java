package com.wcq.adapter.service;

public class LoginFromWeChartAdapter implements LoginAdapter {
    @Override
    public boolean support(LoginAdapter adapter) {
        return adapter instanceof LoginFromWeChartAdapter;
    }

    @Override
    public ResultMsg login(String username, LoginAdapter adapter) {
        return null;
    }
}
