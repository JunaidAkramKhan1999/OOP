public class AccountOfCustomer{
	private String  customerName;
	private  String typeOfAccount;
	private  String accountNum;
	private  double currentBalance;


public AccountOfCustomer(String customerName,String typeOfAccount,String accountNum,double currentBalance){
	this.customerName=customerName;
	this.typeOfAccount=typeOfAccount;
	this.accountNum=accountNum;
	this.currentBalance=currentBalance;
}
public String getcustomerName(){
return this.customerName;
}
public String gettypeOfAccount(){
return this.typeOfAccount;
}
public String getaccountNum(){
return this.accountNum;
}
public double getcurrentBalance(){
return this.currentBalance;
}
public void setcustomerName(String customerName){
 this.customerName=customerName;
}
public void settypeOfAccount(String typeOfAccount){
 this.typeOfAccount=typeOfAccount;
}
public void setaccountNum(String accountNum ){
 this.accountNum=accountNum;
}
public void setcurrentBalance(double currentBalance){
 this.currentBalance=currentBalance;
}

public  void deposit(double balance){
  currentBalance = getcurrentBalance() + balance;
}
public  void withdraw(double balance){ 
  currentBalance = getcurrentBalance() - balance;
}
public void displayInformation(){
System.out.println("Customer Name :"+ customerName + "\nCustomer Accountnum :" + accountNum +"\nType of account :"+ typeOfAccount + "\ncustomer current balance :"+currentBalance);
}
}
