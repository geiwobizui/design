package com.wcq.factory.abs;

public class GLFridge implements Fridge{
    @Override
    public void frozen() {
        System.out.println("GLFridge bing dong");
    }
}
