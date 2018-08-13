public class DesktopComputer extends Computer {
	
	private String  monitorDimensions;

public DesktopComputer(String companyName,String model,String processorType,double price,String monitorDimensions){
	super(companyName,model,processorType,price);
	this.monitorDimensions=monitorDimensions;
}
public String getmonitorDimensions(){
return monitorDimensions;
}
public void setmonitorDimensions(String monitorDimensions){
	this.monitorDimensions=monitorDimensions;
}

public void Display(){
System.out.println("Company name :"+getcompanyName()+ "\nModel Nmae : "+getmodel() + "\nProcessor Type :" +getprocessorType()+ "\nPrice :"+ getprice() + "\nMonitor Demensions :"+getmonitorDimensions());
} 


}