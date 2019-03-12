package com.wcq.factory.simple;

import com.wcq.factory.Car;
import com.wcq.factory.Traffic;

public class Test {
	public static void main(String[] args) {
		TrainFactory trainFactory = new TrainFactory();
		Traffic hc = trainFactory.create("hc");
		System.out.println(hc.toString());

		Traffic car = trainFactory.create_yh(Car.class);
		System.out.println(car.toString());
	}
}
