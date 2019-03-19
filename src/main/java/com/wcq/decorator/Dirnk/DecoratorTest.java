package com.wcq.decorator.Dirnk;

/**
 * IO的实现就是用的装饰者模式
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Mocha mocha = new Mocha(new Milk(new HomeBlend()));
        String description = mocha.getDescription();
        float cost = mocha.cost();
        System.out.println(description);
        System.out.println(cost);
    }
}
