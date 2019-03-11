package com.wcq.proxy.statics;

import com.wcq.proxy.Person;
import com.wcq.proxy.Student;

public class StaticProxy implements Person {
    private Person person;
    public StaticProxy(){
        person = new Student();
    }
    @Override
    public void learn() {
        person.learn();
        System.out.println("Student Proxy");
    }
}
