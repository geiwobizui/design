package com.wcq.strategy.casetwo;

public class WeChatPay extends Pay {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double getBalance(String uid) {
        return 300;
    }
}
