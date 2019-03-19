package com.wcq.observer.gupao;

import java.util.Observable;

/**
 * JDk
 *  观察者模式的实现
 *  此类未被观察者
 */
public class GPer extends Observable {
    private String name = "GPer 生态圈";
    private static GPer gper = null;
    private GPer(){}
    public static GPer getInstance(){
        if(gper == null){
            gper=new GPer();
        }
        return gper;
    }
    public String getName() {
        return name;
    }
    public void publicMsg(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
