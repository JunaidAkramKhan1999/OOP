public class Person {
	private String name ;
	private String address ;
	private double phoneNumber;
	private String emailAddress;


public Person(){}	
public Person (String name,String address,double phoneNumber,String emailAddress){
	this.name=name;
	this.address=address;
	this.phoneNumber=phoneNumber;
	this.emailAddress=emailAddress;
}
public String getname(){
return name;
}
public String getaddress(){
return address;
}
public double getphoneNumber(){
return phoneNumber;
}
public String getemailAddress(){
return emailAddress;
}
public void setname(String name ){
this.name=name;
}
public void setaddress(String address){
this.address=address;
}
public void setphoneNumber(double phoneNumber){
this.phoneNumber=phoneNumber;
}
public void setemailAddress(String emailAddress){
 this.emailAddress=emailAddress;
}


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public void displayData() {
    }
}


