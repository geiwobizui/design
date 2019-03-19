package com.wcq.observer.guava_g;

import com.google.common.eventbus.Subscribe;
import com.wcq.observer.gupao.GPer;
import com.wcq.observer.gupao.Question;

public class Guava_GPer {
    private String name = "GPer 生态圈";
    private static Guava_GPer gper = null;
    private Guava_GPer(){}
    public static Guava_GPer getInstance(){
        if(gper == null){
            gper=new Guava_GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }
    @Subscribe
    public void publicMsg(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
    }
}
