package com.wcq.factory.factory;

import com.wcq.factory.Car;
import com.wcq.factory.Traffic;

public class CarFactory implements Factory {

	@Override
	public Traffic getFactory() {
		return new Car();
	}
}
