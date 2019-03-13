package com.wcq.proxy.customjdkproxy;

import java.lang.reflect.Method;

public class MyAgency implements MyInvocationHandler {
    private Object target;
    public Object getInstance(Object target){
        this.target=target;
        Class<?> aClass = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),aClass.getInterfaces(),this);
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
