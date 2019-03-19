package com.wcq.decorator.battercake;

/**
 * 装饰者模式：is-a 通过定义个需要装饰的抽象类，用一个base类继承此抽象类，再定义一些装饰类，用于对基础类的装饰；
 *      无论怎么装饰最后都还是这个东西，即进行了一个横向的扩展 （一种覆盖）
 */
public class BatterCakeTest {
    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake = new BaseBatterCake();

        batterCake = new EggBatterCake(batterCake);
        batterCake = new EggBatterCake(batterCake);
        System.out.println(batterCake.getMsg()+"="+batterCake.getPrice()+"元");
    }
}
