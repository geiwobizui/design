package com.wcq.strategy.casetwo;

public class JDPay extends Pay {
    @Override
    public String getName() {
        return "京东支付";
    }

    @Override
    protected double getBalance(String uid) {
        return 200;
    }
}
