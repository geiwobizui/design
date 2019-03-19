package com.wcq.observer.guava_g;

import com.google.common.eventbus.Subscribe;
import com.wcq.observer.gupao.Question;

public class Guava_Teacher{
    private String name;

    public Guava_Teacher(String name) {
        this.name = name;
    }

    public void update(Object o, Object arg) {
        Guava_GPer gper = (Guava_GPer)o;
        Question question = (Question)arg;
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                        "您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                        question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
