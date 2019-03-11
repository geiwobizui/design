package com.wcq.singleton.hungry;

/**
 * 饿汉模式改进 （可用）
 *      静态代码块中进行类的实例化：也是在类加载的时候，调用静态代码块，初始化类的实例
 *      优缺点不变
 */
public class HungryTwo {
    private static HungryTwo hungryTwo;
    //静态代码块
    static {
        hungryTwo = new HungryTwo();
    }
    private HungryTwo(){}
    public static HungryTwo getInstance(){
        return hungryTwo;
    }
}
