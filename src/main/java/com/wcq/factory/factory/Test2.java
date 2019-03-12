package wcq.factory;

import wcq.Traffic;

public class Test2 {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Traffic factory = carFactory.getFactory();
		System.out.println(factory.toString());
	}
}
