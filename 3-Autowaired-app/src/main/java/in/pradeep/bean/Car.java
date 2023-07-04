package in.pradeep.bean;

public class Car {
	private DieselEngine diseleEng;
	
	public void setDiesele(DieselEngine diseleEng) {
		this.diseleEng=diseleEng;
		
	}
public Car() {
	// TODO Auto-generated constructor stub
	System.out.println("car: constructor");
}
public void drive() {
	int start = diseleEng.start();
	if (start>=1) {
		System.out.println("journy started");
	}else
		System.out.println("engine fail to start ");
		
}
}
 