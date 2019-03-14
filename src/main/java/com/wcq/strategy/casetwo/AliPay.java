package com.wcq.strategy.casetwo;

public class AliPay extends Pay {
    @Override
    public String getName() {
        return "支付宝支付";
    }

    @Override
    protected double getBalance(String uid) {
        return 500;
    }
}
