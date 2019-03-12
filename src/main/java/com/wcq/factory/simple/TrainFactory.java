package com.wcq.factory.simple;

import com.wcq.factory.Bus;
import com.wcq.factory.Car;
import com.wcq.factory.Traffic;
import com.wcq.factory.Train;

public class TrainFactory {
//	private static TrainFactory tf=new TrainFactory();
	public TrainFactory() {
	}

	public Traffic create(String s){
		if("hc".equals(s)){
			return new Train();
		}else if("db".equals(s)){
			return new Bus();
		}else if("qc".equals(s)){
			return new Car();
		}else{
			return null;
		}
	}

	//优化
	public Traffic create_yh(Class<? extends Traffic> clazz){
		try {
			if(clazz != null)
			return clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
