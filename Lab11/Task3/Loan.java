import java.util.Scanner;

public class Loan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int loanAmount;
        int noOfYear;
        int interestRate;

        try{
            System.out.println("Enter Loan Amount :");
            loanAmount = input.nextInt();
            if (loanAmount <= 0 ){
                throw new IllegalArgumentException("Loan amount is less then equal to zero");
            }
            System.out.println("Enter interest Rate :");
           interestRate = input.nextInt();
            if (interestRate <=0) {
                throw new IllegalArgumentException("Interest Rate is less then equal to zero ");
            }
            System.out.println("Enter No of Year :");
            noOfYear = input.nextInt();
            if (noOfYear <=0) {
                throw new IllegalArgumentException("No of year is less then equal to zero ");
            }

        }catch (IllegalArgumentException e){
            System.out.println(e);
        }





    }




}
