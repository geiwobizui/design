package com.wcq.singleton.full;

/**
 * 设计模式之单例模式：
 *      饱汉式
 *      优点：起到了lazy loading的效果 但只能在单线程下使用
 *      缺点：在多线程下，若多个线程同时走至if(hungryOne==null) 会创建多个单例实例
 */
public class FullOne {
    //线程不安全 （不可用）
    private static FullOne hungryOne = null;
    private FullOne(){}
    public static FullOne getInstance(){
        if(hungryOne==null){
            hungryOne = new FullOne();
        }
        return hungryOne;
    }
}
