package com.wcq.factory;

public class Car implements Traffic {
	public Car(){}
	@Override
	public Traffic getTraffic() {
		return new Car();
	}
}
