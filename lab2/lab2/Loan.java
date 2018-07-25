public  class Loan{
	public static void main (String[] args){
	
	System.out.println(" person take loan of 200000");
	System.out.println(" per year 23% is detectected");

	double loantake = 200000;
	double loandetect = 23*3;
	double loanremain = loantake - ((loantake*loandetect)/100);
	double loanpaid = loantake - loanremain;

	System.out.println(" after three year it loan is paid" +loanpaid);
}
}