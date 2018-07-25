
public class TestAccountOfCustomer {
	public static void main(String[] args)
{

	AccountOfCustomer customer1 = new AccountOfCustomer("junaid akram khan","Assan account","Xyz",5000);
	
	customer1.setcurrentBalance(10000);
	customer1.deposit(500);
	customer1.withdraw(5500);
	customer1.deposit(50000);
	customer1.displayInformation();

	AccountOfCustomer customer2 = new AccountOfCustomer("Ali khan","Assan account","Xyz",5000);
	
	customer2.setcurrentBalance(10000);
	customer2.deposit(500);
	customer2.withdraw(5500);
	customer2.deposit(5000);
	customer2.displayInformation();

	AccountOfCustomer customer3 = new AccountOfCustomer("Shahzaib Rasool khan","Assan account","Xyz",5000);
	
	customer3.setcurrentBalance(10000);
	customer3.deposit(500);
	customer3.withdraw(5500);
	customer3.deposit(500);
	customer3.displayInformation();
	
}
}