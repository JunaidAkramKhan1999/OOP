 import java.util.Scanner;
 
class HeadOrTail{
    public static void main (String [] args) {
        int number, guess;
 
        // Obtain the random number 0 or 1  
        number = (int) (Math.random() * 2);
        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
 
        System.out.print("Guess head or tail? Enter 0 for head and 1 for tail: ");
        guess = input.nextInt();
 
        // Check the guess
        if (guess == number) {
            System.out.println("Correct guess");
        } else {
            System.out.println("Wrong guess");
        }
    }
}