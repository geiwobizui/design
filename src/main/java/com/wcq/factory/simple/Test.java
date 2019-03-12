package wcq.simple;

import wcq.Traffic;

public class Test {
	public static void main(String[] args) {
		TrainFactory trainFactory = new TrainFactory();
		Traffic hc = trainFactory.create("hc");
		System.out.println(hc.toString());
	}
}
