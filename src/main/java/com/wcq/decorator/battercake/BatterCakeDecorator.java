package com.wcq.decorator.battercake;

public abstract class BatterCakeDecorator extends BatterCake {
    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    protected String getMsg(){
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice(){
        return this.batterCake.getPrice();
    }
}
