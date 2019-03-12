package com.wcq.factory.abs;

public class HEFridge implements Fridge{
    @Override
    public void frozen() {
        System.out.println("HEFridge bing dong");
    }
}
