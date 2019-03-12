package wcq.factory;

import wcq.Car;
import wcq.Traffic;

public class CarFactory implements Factory {

	@Override
	public Traffic getFactory() {
		return new Car();
	}
}
