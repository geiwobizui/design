package com.wcq.decorator;

public class HomeBlend extends Drink {
    public HomeBlend() {
        super.description="Home Blend cofe";
    }

    @Override
    public float cost() {
        return 6.5f;
    }
}
