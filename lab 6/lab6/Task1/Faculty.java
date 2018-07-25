public class Faculty extends Person{
	private String employeeId;
	private  float basicSalary;
	private  int officeHours ;
	private String designation;

public Faculty(String name,String address,double phoneNumber,String emailAddress,String employeeId,float basicSalary,int officeHours,String designation){
	super(name,address,phoneNumber,emailAddress);
	this.employeeId=employeeId;
	this.basicSalary=basicSalary;
	this.officeHours=officeHours;
	this.designation=designation;
}
public String getemployeeId(){
return employeeId;
}
public float getbasicSalary(){
return basicSalary;
}
public int getofficeHours(){
return officeHours;
}
public String getdesignation(){
return designation;
}
public void setemployeeId(String employeeId){
this.employeeId=employeeId;
}
public void setbasicSalary(float basicSalary){
this.basicSalary=basicSalary;
}
public void setofficeHours(int officeHours){
this.officeHours=officeHours;
}
public void setdesignation(String designation){
this.designation=designation;
}


    @Override
    public String toString() {
        return super.toString();
    }

    public void displayData(){
System.out.println("\n Faculty name :"+getname() +"\n Faculty address :"+getaddress() +"\n Faculty phone number : "+getphoneNumber() + "\n Faculty email address :" +getemailAddress() + "\n employee id " +getemployeeId() + " \n Employee salary :" +getbasicSalary() + "\n Office hours :" +getofficeHours() + "\n Designation :" +getdesignation() );
}
}