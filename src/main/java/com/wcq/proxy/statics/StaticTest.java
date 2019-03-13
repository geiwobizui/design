package com.wcq.proxy.statics;

import com.wcq.proxy.Student;

public class StaticTest {
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(new Student());
        staticProxy.learn();
    }
}
