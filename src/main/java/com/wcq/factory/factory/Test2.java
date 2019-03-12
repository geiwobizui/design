package com.wcq.factory.factory;

import com.wcq.factory.Traffic;

public class Test2 {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Traffic factory = carFactory.getFactory();
		System.out.println(factory.toString());
	}
}
