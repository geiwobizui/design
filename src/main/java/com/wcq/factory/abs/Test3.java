package com.wcq.factory.abs;

public class Test3 {
    public static void main(String[] args) {
        GLFactory glFactory = new GLFactory();
        glFactory.getAirConditioner().refrigeration();
        glFactory.getFridge().frozen();
    }
}
