import java.util.Scanner;
public class Limit {
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
		
	System.out.println("enter account num");
	int acc = input.nextInt();
		
	System.out.println("enter Balance at the begning of month");
	int  bmon = input.nextInt();
		
	System.out.println("enter total of items charges by custumer this month");
	int charmon = input.nextInt();

		
	System.out.println("enter total of all credit applied to the customer ? account this month :");
	int creditapp = input.nextInt();

	System.out.println("enter allow cridit limit");
	int limit = input.nextInt();
	

	int newBalance;
	newBalance = bmon+charmon-creditapp;

	if (newBalance > creditapp){
	System.out.println(" cridit limit excess");
	} else {
	System.out.println(" cridit limit NOT excess");
	}
}
}
