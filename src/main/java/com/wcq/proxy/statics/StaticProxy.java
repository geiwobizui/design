package com.wcq.proxy.statics;

import com.wcq.proxy.Person;
import com.wcq.proxy.Student;

public class StaticProxy implements Person {
    private Person person;
    public StaticProxy(Person person){
        this.person = person;
    }
    @Override
    public void learn() {
        System.out.println("Student Proxy before");
        person.learn();
        System.out.println("Student Proxy after");
    }
    //由于静态代理每次需要代理的时候都要对代理类进行修改，违背了开闭原则，从而出现了动态代理
}
