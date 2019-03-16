package com.wcq.decorator;

public class Mocha extends CondimentDecorator {
    protected Drink drink;
    public Mocha(Drink drink){
        this.drink=drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+",with Mocha";
    }

    @Override
    public float cost() {
        return 5.0f+drink.cost();
    }
}
