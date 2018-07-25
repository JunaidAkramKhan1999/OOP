public  class MarketingDepartment extends SalesDepartment {

	private int leaves = 2;

public MarketingDepartment(String employeeId,String employeeName,String department){
	super(employeeId,employeeName,department);
}
public  int getleaves(){
return leaves;
}
public  void setleaves(int leaves ){
  this.leaves=leaves;
}
public void Display(){
System.out.println("\n Information :");
System.out.println("\n Marketing Department  Employe Id :"+ getemployeeId() + "\n Marketing Department  Employe Name : " + getemployeeName() + " \n Marketing Department  Employe Department  : " + getdepartment() + " \n Marketing Department  Employe Commision  : " + getcommistion() +" \n Marketing Department  Employe leaves : " + getleaves() );
System.out.println("\n Marketing employee design advertisements and maintain social media to get customers");
} 
}