import java.util.Scanner;

public class SquareRootNum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num :");
        int n;
        try {
            n =input.nextInt();
            if (n < 0){
                throw new Exception("Imaginary num");
            }
        }catch (Exception e){
            System.out.println(e);
        }





    }


}
