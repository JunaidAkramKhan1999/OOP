import java.util.Random;
import java.util.Scanner;




public class HeadTail{


	public static void main (String[] args){


	Random r1 = new Random();

	
	int toss = r1.nextInt(2);


	System.out.println("Guess your number: ");

	Scanner input = new Scanner(System.in);

	
	int enterUser = input.nextInt();


	if (enterUser == toss) {

	System.out.println("correct");

	}  else{
	System.out.println(" NOT correct");
	}
}
}

