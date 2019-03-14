package com.wcq.strategy.casetwo;

/**
 * 支付渠道
 */
public abstract class Pay {
    //支付类型
    public abstract String getName();
    //余额
    protected abstract double getBalance(String uid);
    //支付扣除
    public Message deduct(String uid ,double amount){
        if(getBalance(uid)<amount){
           return new Message(500,"余额不足","支付失败");
        }
        return new Message(200,"支付金额"+amount,"支付成功");
    }
}
