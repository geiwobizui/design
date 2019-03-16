package com.wcq.decorator;

public class Milk extends CondimentDecorator {
    protected Drink drink;
    public Milk(Drink drink){
        this.drink=drink;
    }
    @Override
    public String getDescription() {
        return drink.getDescription()+",with milk";
    }

    @Override
    public float cost() {
        return 2.3f+drink.cost();
    }
}
