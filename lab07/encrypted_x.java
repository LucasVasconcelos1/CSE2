// Lucas Vasconcelos 10/09/15 lab07 Encrypted x
// all comments pertain to coding in the line above them or adjacent to them
// This program will hide the secret message X in a handful of stars using while
//loops
import java.util.Scanner;
// import the scanner class
public class encrypted_x {
    // beginnning of class
    public static void main(String[] args) {
        // beginning of the main method
        Scanner myScanner = new Scanner(System.in);
        // create the instance for using the scanner class in the main method
        System.out.print("Enter an integer number from 0-100: ");
        // prompt the user to input an integer number from 0-100
        int input;
        // accept user input for an integer number from 0-100
        while (true) {
            if (!myScanner.hasNextInt()) {
                System.out.print("Sorry, you did not enter an integer number from 0-100. Try again: ");
                myScanner.next();
            }
            else {
                input = myScanner.nextInt();
                if (input < 0 || input > 100) {
                    System.out.print(" Please only enter integers from 0-100. Try again: ");
                }
                else {
                    break;
                }
            }
        }
        // use a while loop with nested if statements to prevent invalid inputs
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if ( i + 1 == (input - j) || j == i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
        System.out.println();
        }
        // use for loops, nested for loops, and nested if statements to create the
        //encrypted message "x"
    }
}
