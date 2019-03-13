package com.wcq.proxy.customjdkproxy;

import com.wcq.proxy.Person;
import com.wcq.proxy.Student;
import com.wcq.proxy.dynamic.Agency;

public class MyJDKProxyTest {
    public static void main(String[] args) {
        Person instance =(Person) new MyAgency().getInstance(new Student());
        instance.learn();
    }
}
