package com.wcq.strategy.casetwo;

public class Order {
    private String uid;
    private String orderid;

    public Order(String uid, String orderid, double amount) {
        this.uid = uid;
        this.orderid = orderid;
        this.amount = amount;
    }

    private double amount;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    //支付
    public Message pay(){
        return pay(PayEnum.ALIPAY);
    }

    public Message pay(Enum e){
        Pay pay1 = PayStrategy.getPay(e);
        System.out.println("欢迎使用"+pay1.getName());
        System.out.println("本次交易金额："+amount+"正在扣费中");
        Message deduct = pay1.deduct(uid, amount);
        return deduct;
    }
}
