package com.wcq.observer.guava_g;

import com.google.common.eventbus.EventBus;
import com.wcq.observer.gupao.Question;

public class Guava_GPerTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Guava_GPer instance = Guava_GPer.getInstance();
        Question question = new Question("涛涛", "Redis实现原理");
        eventBus.register(instance);
        eventBus.post(question);
        Guava_Teacher wcq = new Guava_Teacher("wcq");
        wcq.update(instance,question);
    }
}
