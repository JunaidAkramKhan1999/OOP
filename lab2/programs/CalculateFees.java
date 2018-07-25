public class CalculateFees {
	public static void main (String[] args){

	
for (  int    tutsionFees = 100 ; tutsionFees <=200 ;tutsionFees = tutsionFees + ((tutsionFees*7)/100) ){
	for ( int year = 2018 ; year <= 2028 ; year++){
	tutsionFees = tutsionFees + ((tutsionFees*7)/100);
	System.out.println("fees  in : "+ year + " is : "+tutsionFees); 
}
 }  

  	

}
	}