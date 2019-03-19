package com.wcq.decorator.battercake;

public class EggBatterCake extends BatterCakeDecorator {

    public EggBatterCake (BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"加1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
