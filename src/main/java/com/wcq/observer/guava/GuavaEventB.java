package com.wcq.observer.guava;

import com.google.common.eventbus.Subscribe;

public class GuavaEventB {
    //用于回调
    @Subscribe
    public void subscribe(String str){
        System.out.println("执行GuavaEventB的subscribe 方法,传入的参数是:" + str);
    }

    @Subscribe
    public void subscribe1(String str){
        System.out.println("执行GuavaEventB的subscribe1 方法,传入的参数是:" + str);
    }
}
