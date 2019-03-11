package com.wcq.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Register {
    private static Map<String,Object> register = new ConcurrentHashMap<>();
    private Register(){}
    public static Register getInstance(String name){
        if(name == null){
            name = Register.class.getName();
        }
        if(register.get(name)==null){
            register.put(name,new Register());
        }
        return (Register) register.get(name);
    }
}
