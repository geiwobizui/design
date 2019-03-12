package wcq;

public class Train implements Traffic {
	public Train(){}
	@Override
	public Traffic getTraffic() {
		return new Train();
	}
}
