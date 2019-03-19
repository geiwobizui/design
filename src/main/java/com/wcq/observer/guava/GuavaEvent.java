package com.wcq.observer.guava;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {
    //用于回调即   标记发布方法
    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe 方法,传入的参数是:" + str);
    }

    @Subscribe
    public void subscribe1(String str){
        System.out.println("执行subscribe1 方法,传入的参数是:" + str);
    }
}
