import java.util.Random;
import java.util.Scanner;
public class RandomNum{
	public static void main (String[] args){
	
	Random random = new Random();
	int r1 = random.nextInt(101);
	Scanner input = new Scanner(System.in);
	System.out.println("wellcome to the Guess the num Game");
	System.out.println("***********Lets Starts a Game");
	System.out.println(" think the num 5 time b/w 1 t0 100 so try : ");
	
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	int number3 = input.nextInt();
	int number4 = input.nextInt();
	int number5 = input.nextInt();	
	
	
	if ( number1 == r1 || number2 == r1 || number3 == r1 || number4 == r1 || number5 == r1  ){
	System.out.println("Congragulations ! you win");
	} else { 
	System.out.println("try again");
	}
	
	
	
}
}