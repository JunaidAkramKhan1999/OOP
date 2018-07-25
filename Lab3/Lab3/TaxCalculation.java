import java.util.Scanner;


class TaxCalculation{

	public static void main (String[] args){

	
	Scanner input = new Scanner(System.in);

	System.out.println("enter your age :");
	
	int age =  input.nextInt(); 
	
	
	System.out.println("Enter the income");
	
	int income =  input.nextInt();

	
	int taxPercentage = 0;

if ( age < 60 ){

		if ( income <= 250000) {

	taxPercentage=0;
	
} else if (income >= 250001 && income <= 500000 ){

	 taxPercentage=10/100;
	
} else if (income <= 500001 && income <= 1000000){

	taxPercentage=20/100;

	} else if (income >= 1000001){

	taxPercentage=30;
	
} 
	
}


	
if ( age >=60 && age <80 ){

	if ( income <= 300000) {

	taxPercentage=0;

	} else if (income >= 300001 && income <= 500000 ){

	 taxPercentage=10;

	} else if (income <= 500001 && income <= 1000000){

	taxPercentage=20;

	} else if (income >= 1000001){

	taxPercentage=30;

	} 
	}

	if ( age >= 80 ){

		if ( income <= 500000) {

	taxPercentage=0;
	
} else if (income >= 500001 && income >= 1000000 ){

	 taxPercentage=20;
	
} else if (income >= 1000001){
	
taxPercentage=30;
	} 
	}
	

	int incomceTax = income*taxPercentage;

	System.out.println("Income Tax : " +incomceTax);

}
}



