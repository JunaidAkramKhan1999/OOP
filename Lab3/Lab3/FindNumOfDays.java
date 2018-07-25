import java.util.Scanner;
public class FindNumOfDays{
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	
	int numOfDaysInMonth=0;
	String nameOfMonth = "";

	
        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();



   switch (month) {
            case 1:
               nameOfMonth = "January";
                numOfDaysInMonth= 31;
                break;
            case 2:
               nameOfMonth = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numOfDaysInMonth = 29;
                } else {
                    numOfDaysInMonth = 28;
                }
                break;
            case 3:
                nameOfMonth = "March";
               numOfDaysInMonth = 31;
                break;
            case 4:
                nameOfMonth = "April";
               numOfDaysInMonth = 30;
                break;
            case 5:
              nameOfMonth= "May";
                numOfDaysInMonth = 31;
                break;
            case 6:
               nameOfMonth = "June";
                numOfDaysInMonth = 30;
                break;
            case 7:
                nameOfMonth = "July";
               numOfDaysInMonth = 31;
                break;
            case 8:
               nameOfMonth = "August";
                numOfDaysInMonth = 31;
                break;
            case 9:
                nameOfMonth = "September";
                numOfDaysInMonth= 30;
                break;
            case 10:
              nameOfMonth = "October";
                numOfDaysInMonth = 31;
                break;
            case 11:
               nameOfMonth = "November";
                numOfDaysInMonth = 30;
                break;
            case 12:
                nameOfMonth = "December";
                numOfDaysInMonth = 31;
        }
        System.out.print(nameOfMonth + " " + year + " has " + numOfDaysInMonth + " days\n");
    }
}
