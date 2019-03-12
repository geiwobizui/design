package wcq.factory;

import wcq.Traffic;
import wcq.Train;

public class TraFactory implements Factory {

	@Override
	public Traffic getFactory() {
		return new Train();
	}
}
