public  class ProcurementDepartment extends SalesDepartment {

	private int tour = 2;

public ProcurementDepartment(String employeeId,String employeeName,String department){
	super(employeeId,employeeName,department);
	
}
public  int gettour(){
return  tour;
}
public  void settour(int tour ){
  this.tour=tour;
}
public void Display(){
System.out.println("\n Information :");
System.out.println("\n Procurement Department  Employe Id :"+ getemployeeId() + " \n Procurement Department  Employe Name : " + getemployeeName() + " \n Procurement Department  Employe Department  : " + getdepartment() + " \n Procurement Department  Employe Commision  : " + getcommistion() +" \n Procurement Department  Employe tour  : " + gettour() );
System.out.println("\n Procurement Empliyee has to contact with other business dealers.");
} 
}