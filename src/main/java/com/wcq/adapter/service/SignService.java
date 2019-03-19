package com.wcq.adapter.service;

public interface SignService {
    ResultMsg register(String username, String password);
    ResultMsg login(String username, String password);
}
