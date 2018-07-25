public class Employees {
	private String employeeId;
	private String employeeName;
	private String department;
	private float basicSalary=40000;


public Employees(String employeeId,String employeeName,String department){
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.department=department;
}

public  String getemployeeId(){
return  employeeId;
}
public  String getdepartment(){
return  department;
}
public  String getemployeeName(){
return  employeeName;
}
public  float getbasicSalary(){
return  basicSalary;
}
public  void setemployeeName( String employeeName ){
  this.employeeName=employeeName;
}
public  void setemployeeId(String employeeId){
  this.employeeId=employeeId;
}
public  void setdepartment(String department){
  this.department=department;
}
public  void setbasicSalary(float basicSalary){
  this.basicSalary=basicSalary;
}
}