package com.wcq.decorator.service;

public class ServiceTest {
    public static void main(String[] args) {

        SignFromThridServiceImpl signFromThridService = new SignFromThridServiceImpl(new SignServiceImpl());
        ResultMsg register = signFromThridService.register("1", "2");
        System.out.println(register.getCode()+register.getMsg());
    }
}
