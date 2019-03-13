package com.wcq.proxy.dynamic;

import com.wcq.proxy.Person;
import com.wcq.proxy.Student;

public class JDKProxyTest {
    public static void main(String[] args) {
        Person instance =(Person) new Agency().getInstance(new Student());
        instance.learn();
    }
}
