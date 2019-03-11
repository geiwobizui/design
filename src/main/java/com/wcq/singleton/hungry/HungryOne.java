package com.wcq.singleton.hungry;

/**
 * 设计模式之单例模式：
 *      饿汉式    （适用于在单例对象很少的情况下）
 *      优点：实现方法简单，在类加载的时候就进行了实例化，避免了多线程时的线程安全问题（避免了线程同步问题）
 *      缺点：在类加载的时候完成了实例化，没有达到lazy loading的效果，若果从始至终都没有使用此类，就造成了内存浪费
 */
public class HungryOne {
    //静态常量（可用）
    private static final HungryOne hungryOne = new HungryOne();
    private HungryOne(){}
    public static HungryOne getInstance(){
        return hungryOne;
    }
}
