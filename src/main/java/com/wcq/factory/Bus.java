package com.wcq.factory;

public class Bus implements Traffic {
	public Bus(){}
	@Override
	public Traffic getTraffic() {
		return new Bus();
	}
}
