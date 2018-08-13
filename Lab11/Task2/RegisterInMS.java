import java.util.Scanner;

public class RegisterInMS {

    Scanner input = new Scanner(System.in);


   public void  StudentInfo() throws  Exception
   {
       System.out.println("Enter Name: ");
       String name = input.next();

       System.out.println("Enter Age: ");
       int age = input.nextInt();

       System.out.println("Enter CGPA");
       double stdCgpa = input.nextDouble();

       if (name.length() > 20) {
           throw new IllegalArgumentException("invalid name && name charater is grater then 20");
       }else if (age > 20){
           throw new IllegalArgumentException("invalid age enter age less then 20 ");
       }
       calculateCGPA(stdCgpa);

   }

   public void Register(){
       try {
           StudentInfo();
       }catch (Exception ex) {
           System.out.println(ex);
       }
   }
    public void calculateCGPA( double stdCGPA) {

        final double MAX_CGPA = 4.0;
        if (MAX_CGPA <= stdCGPA) {
            throw new IllegalArgumentException("Your GPA is Invalid");
        }
    }


}
