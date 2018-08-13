public abstract class Computer {
	private String companyName;
	private String model;
	private String processorType;
	private double price;

public Computer(String companyName,String model,String processorType,double price){
	this.companyName=companyName;
	this.model=model;
	this.processorType=processorType;
	this.price=price;
}
public String getcompanyName(){
return companyName;
}
public void setcompanyName(String companyName){
	this.companyName=companyName;
}
public String getmodel(){
return model;
}
public void setmodel(String model){
	this.model=model;
}
public String getprocessorType(){
return processorType;
}
public void setprocessorType(String processorType){
	this.processorType=processorType;
}
public double getprice(){
return price;
}
public void setprice(double price){
	this.price=price;
}

	@Override
	public String toString() {
		return "Computer{" +
				"companyName='" + companyName + '\'' +
				", model='" + model + '\'' +
				", processorType='" + processorType + '\'' +
				", price=" + price +
				'}';
	}
}
