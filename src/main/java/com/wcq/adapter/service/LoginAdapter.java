package com.wcq.adapter.service;

public interface LoginAdapter {
    boolean support(LoginAdapter adapter);
    ResultMsg login(String username,LoginAdapter adapter);
}
