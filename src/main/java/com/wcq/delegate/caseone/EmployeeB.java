package com.wcq.delegate.caseone;

public class EmployeeB implements Employee {
    @Override
    public void excute(String command) {
        System.out.println("员工B，擅长黑客");
    }
}
