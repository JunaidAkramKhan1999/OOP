public class CalculateFees {
	public static void main (String[] args){

	double tutsionFees = 122600;
	double fees =  (tutsionFees*2);
	while( tutsionFees <= fees ){
	tutsionFees = tutsionFees + ((tutsionFees*6.5)/100);
	for ( int year = 2018 ; year <= 2028 ; year++){
	tutsionFees = tutsionFees + ((tutsionFees*6.5)/100);
	System.out.println("fees  in : "+ year + " is : "+tutsionFees); 
}
 }  

  System.out.println("Fees is Double !");	

}
	}