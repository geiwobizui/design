package com.wcq.strategy.casetwo;

public class CaseTwoTest {
    public static void main(String[] args) {
        Order order = new Order("1", "20190314000002", 235.55);
        Message mag = order.pay();
        System.out.println(mag);
    }
}
