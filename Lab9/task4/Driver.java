import java.util.Scanner;
import java.util.ArrayList;
public class Driver {
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("How Many computer you want to Shop :");
	int N = input.nextInt();
	System.out.println("Select TYPE OF COMPUTER :\nexample : \n1)Desktop Computer \n2)Laptop Computer");
	for (int i=0 ; i < N ;i++){
	int n =  input.nextInt();
	ArrayList<Computer> computerList;
	Computer desktopcomputer1 = new DesktopComputer("HP","EA2018","I8 8 geneation",83000,"Led monitor");
	Computer laptopcomputer1 = new LaptopComputer("Apple mac","2020","9 generation",90000,"25 pixcel","20 inch","2 kg");

	switch (n){
		case 1 :
			computerList = new ArrayList<Computer>();
			computerList.add(desktopcomputer1);
			System.out.println(computerList);
			break;
		case 2:
			computerList = new ArrayList<Computer>();
			computerList.add(laptopcomputer1);
			System.out.println(computerList);
			break;
			default:
		System.out.println("Enter right alphabets");
	}


}
}
}








