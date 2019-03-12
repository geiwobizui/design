package com.wcq.factory.abs;

public class GLFactory implements AbsFactory{

    @Override
    public Fridge getFridge() {
        return new GLFridge();
    }

    @Override
    public AirConditioner getAirConditioner() {
        return new GLAirConditioner();
    }
}
