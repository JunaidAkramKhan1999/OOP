import java.util.Scanner;
   public class TestEmployes{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("enter employee id :");
	String empId = input.nextLine();

	System.out.println("enter employee Name :");
	String empName = input.nextLine();

	System.out.println("enter employee Department : \n example : \n salesdepartment \n marketingdepartment \n procurementdepartment :-");
	String empdepartment = input.nextLine();
 	
       	Employees employe1 = new Employees(empId,empName,empdepartment);
	SalesDepartment salesdepartmentemploye1 = new SalesDepartment(empId,empName,empdepartment);
	MarketingDepartment marketingdepartmentemploye1 = new MarketingDepartment(empId,empName,empdepartment);
	ProcurementDepartment procurementdepartmentemploye1 = new ProcurementDepartment(empId,empName,empdepartment);

if (empdepartment.equals("salesdepartment")){
	salesdepartmentemploye1.Display();
} else if (empdepartment.equals("marketingdepartment")){
	marketingdepartmentemploye1.Display();
} else if (empdepartment.equals("procurementdepartment")){
	procurementdepartmentemploye1.Display();
} else {
System.out.println(" Plz right correct alphabets of department");
}
	
}
}