import java.util.Scanner;
public class CalculateCost{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter the weight in kg");
	double weightInKg = input.nextDouble();
	double weightInPounds = weightInKg*(2.20);
	System.out.println("weight in pound is "+weightInPounds);
	double costInDollar=0;
	if ( weightInPounds > 0 && weightInPounds <= 1)
	 {
	 costInDollar =  costInDollar+3.5 ;
	System.out.println("cost in Dollar $ " +costInDollar);

	} else 	if ( weightInPounds > 1 && weightInPounds <= 3)
	 {
	 costInDollar =  costInDollar+5.5 ;
	System.out.println("cost in Dollar $ " +costInDollar);

	} else 	if ( weightInPounds > 3 && weightInPounds <= 10)
	 {
	 costInDollar = costInDollar+8.5 ;
	System.out.println("cost in Dollar $ " +costInDollar);
	} else 	if ( weightInPounds > 10 && weightInPounds <= 20)
	 {
	 costInDollar =  costInDollar+20.5 ;
	System.out.println("cost in Dollar $ " +costInDollar);

	} else 	if ( weightInPounds > 20 && weightInPounds <= 30)
	 {
	 costInDollar =  costInDollar+30.5 ;
	System.out.println("cost in Dollar $ " +costInDollar);

	 } else if ( weightInPounds > 30 && weightInPounds <= 40)
	 {
	 costInDollar =  costInDollar+40.5 ;
	System.out.println("cost in Dollar $ " +costInDollar);

	} else 	if ( weightInPounds > 40 && weightInPounds <= 50)
	 {
	 costInDollar =  costInDollar+50.5 ;
	System.out.println("cost in Dollar $ " +costInDollar);

	}else if ( weightInPounds > 50 )
	{
	System.out.println("pakkage cannot shift");
	}
}
}