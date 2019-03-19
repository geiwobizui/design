package com.wcq.decorator.Dirnk;

public class HomeBlend extends Drink {
    public HomeBlend() {
        super.description="Home Blend cofe";
    }

    @Override
    public float cost() {
        return 6.5f;
    }
}
