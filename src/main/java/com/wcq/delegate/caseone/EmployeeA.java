package com.wcq.delegate.caseone;

public class EmployeeA implements Employee {
    @Override
    public void excute(String command) {
        System.out.println("员工A，擅长爬虫");
    }
}
