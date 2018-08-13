import java.util.Scanner;

public class ShopingSystem {


    Scanner input = new Scanner(System.in);

    public void Counter() throws  IllegalArgumentException{
        System.out.println("enter the Credit  Card Balance");
        int creditCard = input.nextInt();
        System.out.println("enter total bills");
        int totalAmount = input.nextInt();

        if(totalAmount > creditCard){
            throw new IllegalArgumentException("your Total amount is greater  then credit card limit");
        }
    }

}

class  Test{

    public static void main(String[] args) {


        ShopingSystem s1 = new ShopingSystem();

        try {
            s1.Counter();
        }catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
    }


}