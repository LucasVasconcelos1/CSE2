// Lucas Vasconcelos 10/09/15 lab07 Twisty
// This program will ask the user for two integers that will be used to create a 
//complex pattern
import java.util.Scanner;
// import the scanner class
public class Twisty {
    // beginnning of class
    public static void main(String[] args) {
        // beginning of the main method
        Scanner myScanner = new Scanner(System.in);
        // create the instance for using the scanner class in the main method
        System.out.print("Enter a Length: "); // ask the user to input a length
        int Length;
        while (true) {
            if (!myScanner.hasNextInt()) {
                System.out.print("Sorry, you did not enter a positive integer from 0-80. Try again: ");
                myScanner.next();
            }
            else {
                Length = myScanner.nextInt();
                if (Length < 0 || Length > 80) {
                    System.out.print("Please only enter positive integers from 0-80. Try again: ");
                }
                else {
                    break;
                }
            }
        }
        // use a while loop with nested if statements to prevent invalid inputs
        System.out.print("Enter a Width: "); // ask the user to input a Width
        int Width;
        while (true) {
            if (!myScanner.hasNextInt()) {
                System.out.print("Sorry, you did not enter a positive integer from 0-80. Try again: ");
                myScanner.next();
            }
            else {
                Width = myScanner.nextInt();
                if (Width < 0 || Width > Length) {
                    System.out.print("Please only enter positive integers from 0-80. Try again: ");
                }
                else {
                    break;
                }
            }
        }
        // use a while loop with nested if statements to prevent invalid inputs
        int counter=Length;
        //declare counter as an int and assign it the value length
        for (int j=0;j<Width;j++) {
            //create the vertical spread
            counter=0;
            //create counter variable to create horizontal spread per line
            int g=0;
            //declare g as an int and assign it the value 0
            while (counter<(Length)) {
                //nest the second for loop in the while loop to print multiple x's
                for (int i=0;i<Width;i++) {
                    //create your x
                    if (g==0) {
                    //make use of your g variable to switch the x's printed to match the pattern
                    if ((j+1)==(Width-i) && counter<Length) {
                        System.out.print("/");
                        counter++;
                    }
                    else if (i == j && counter<Length) {
                        System.out.print("#");
                        counter++;
                    }
                    else {
                        System.out.print(" ");
                        counter++;
                    }
                    }
                    if (g==1) {
                    //print this x when g=1
                    if ((j+1)==(Width-i) && counter<Length) {
                        System.out.print("#");
                        counter++;
                    }
                    else if (i == j && counter<Length) {
                        System.out.print("\\");
                        counter++;
                    }
                    else {
                        System.out.print(" ");
                        counter++;
                    }
                    }
                }
                if (g==0) {
                    g=1;
                    //switch your g value to print the second x
                }
                else {
                    g=0;
                    //switch your g value to print the first x again
                }
            }
            System.out.println();
        }
    }
}
