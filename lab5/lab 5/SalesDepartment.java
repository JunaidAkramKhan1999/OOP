public class SalesDepartment extends Employees{
	

	private  float commistion = (getbasicSalary()*10)/100;

public SalesDepartment(String employeeId,String employeeName,String department){
	super(employeeId,employeeName,department);
}
public  float getcommistion(){
return  commistion;
}
public  void setcommistion(float commistion ){
  this.commistion=commistion;
}
	
public void Display(){
System.out.println("\n Information :");
System.out.println("\n Sales Department  Employe Id :"+ getemployeeId() + "\n Sales Department  Employe Name : " + getemployeeName() + " \n Sales Department  Employe Department  : " + getdepartment() + " \n Sales Department  Employe Commision  : " + getcommistion() );
System.out.println("\n Sales Employee visit places to increase sales");
} 
}