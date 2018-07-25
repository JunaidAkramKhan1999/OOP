import java.util.Scanner;
public class CalculateBmi{
	public static void main(String[] args){	
		Scanner input = new Scanner(System.in);
	System.out.println("enter the weight in pounds");
	double weightInPounds = input.nextFloat();
	System.out.println("enter the height in inch");
	double heightInInch = input.nextFloat();
	double wieghInkg;
	  wieghInkg = weightInPounds*0.45;
	
	double heightInMeter;
	 heightInMeter = heightInInch*0.0254;		

	double BMI = wieghInkg/heightInMeter*heightInMeter;


	if (BMI < 18.5 ){
	System.out.println("underweight");
	}
	else if (BMI < 25.0 && BMI >= 18.5){
	System.out.println("normal");
	}
	else if (BMI < 30.0 && BMI >=25.0){
	System.out.println("overweight");
	}	
	else if (BMI >=30.0) {
	System.out.println("obese");
	}
	System.out.println("BMI is :"+BMI);
}
}