package com.wcq.factory.abs;

public class HEFactory implements AbsFactory{
    @Override
    public Fridge getFridge() {
        return new HEFridge();
    }

    @Override
    public AirConditioner getAirConditioner() {
        return new HEAirConditioner();
    }
}
