import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Class student = new Class();

        System.out.println("Select One Option to View Your \n1)Student Serial No \n2)Student Marks \n3)Student Quiz Num \n4)Student Assignment Number");
        int option = input.nextInt();
        String name;
        switch (option){
            case 1 :
                System.out.println("Enter your name :");
                 name = input.next();
                System.out.println("your serial num is");
                student.getStudentSerialNums(name);
            break;
            case 2 :
                System.out.println("Enter your name :");
                name = input.next();
                System.out.println("your marks is");
                student.getStudentMarks(name);
                break;
            case 3 :
                System.out.println("Enter your name :");
                name = input.next();
                System.out.println("your quiz num is");
                student.getStudentQuizNum(name);
                break;
            case 4:
                System.out.println("Enter your name :");
                name = input.next();
                System.out.println("your assignment marks is");
                student.getStudentAssignmentNum(name);
                break;
        }









    }

}
