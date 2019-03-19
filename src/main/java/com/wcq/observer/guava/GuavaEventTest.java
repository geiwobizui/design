package com.wcq.observer.guava;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {
    public static void main(String[] args) {
        //事件总线 用于注册事件
        EventBus eventBus = new EventBus();
        //需注册的事件
        GuavaEvent guavaEvent = new GuavaEvent();
        GuavaEventB guavaEventB = new GuavaEventB();
        //注册(添加通知对象)
        eventBus.register(guavaEvent);
        eventBus.register(guavaEventB);
        //通知(执行发布方法)
        eventBus.post("涛涛");
    }
}
