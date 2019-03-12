package wcq.simple;


import wcq.Bus;
import wcq.Traffic;
import wcq.Train;

public class TrainFactory {
//	private static TrainFactory tf=new TrainFactory();
	public TrainFactory() {
	}

	public Traffic create(String s){
		if("hc".equals(s)){
			return new Train();
		}else if("db".equals(s)){
			return new Bus();
		}else{
			return null;
		}
	}
}
