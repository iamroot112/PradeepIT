package in.pradeep;

public class Airtel implements Sim {

	public Airtel() {
		// TODO Auto-generated constructor stub
		System.out.println("airtel onbject created");
	}
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling useing airtel sim ");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("browsing internet useing airtel sim");

	}

}
