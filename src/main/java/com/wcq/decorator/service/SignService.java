package com.wcq.decorator.service;

public interface SignService {
    ResultMsg register(String username,String password);
    ResultMsg login(String username,String password);
}
