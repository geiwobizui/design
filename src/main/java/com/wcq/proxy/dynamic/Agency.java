package com.wcq.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Agency implements InvocationHandler {
    private Object target;
    public Object getInstance(Object target){
        this.target=target;
        Class<?> aClass = target.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }
    public void before(){
        System.out.println("代理前");
    }
    public void after(){
        System.out.println("代理后");
    }
}
