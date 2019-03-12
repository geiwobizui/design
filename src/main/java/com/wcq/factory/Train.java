package com.wcq.factory;

public class Train implements Traffic {
	public Train(){}
	@Override
	public Traffic getTraffic() {
		return new Train();
	}
}
