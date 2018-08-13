public class LaptopComputer extends Computer {
	private  String camera;
	private String size ;
	private  String weight ;

public  LaptopComputer(String companyName,String model,String processorType,double price,String camera,String size,String weight){
	super(companyName,model,processorType,price);
	this.camera=camera;
	this.size=size;
	this.weight=weight;
}
public String getcamera(){
return camera;
}
public 	void setcamera(String camera){
	this.camera=camera;
}
public String getsize(){
return size;
}
public 	void setsize(String size){
	this.size=size;
}

public String getweight(){
return weight;
}
public 	void setweight(String weight){
	this.weight=weight;
}
public void Display(){
System.out.println("Company name :"+getcompanyName()+ "\nModel Nmae : "+getmodel() + "\nProcessor Type :" +getprocessorType()+ "\nPrice :"+ getprice() + "\nCamera  :"+getcamera()+"\nSize :"+getsize() + "\nWeight"+getweight());
} 

}
