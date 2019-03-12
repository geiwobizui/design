package com.wcq.factory.factory;

import com.wcq.factory.Traffic;
import com.wcq.factory.Train;

public class TraFactory implements Factory {

	@Override
	public Traffic getFactory() {
		return new Train();
	}
}
