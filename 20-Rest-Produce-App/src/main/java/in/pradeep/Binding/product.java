package in.pradeep.Binding;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class product {
	private Integer PID;
	private String PName;
	private Double Price;
	public Integer getPID() {
		return PID;
	}
	public void setPID(Integer pID) {
		PID = pID;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public product(Integer pID, String pName, Double price) {
		super();
		PID = pID;
		PName = pName;
		Price = price;
	}
	public product() {
		super();
	}
	

}
