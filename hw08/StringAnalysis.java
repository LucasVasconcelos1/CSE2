// Lucas Vasconcelos 10/20/15 hw08 StringAnalysis
/* This program will process a string by examining all the characters, or just 
a specified number of characters in the string, and determining if they are 
letters. This program will also let the user enter a string and choose if he or
she wants to examine all the characters or just a certain number*/
import java.util.Scanner;
// import the scanner class
public class StringAnalysis {
    // beginnning of class
    
    public static boolean main2( String a) {
        //beginning of the first method
        boolean t = true;
        int length = a.length();
        //determine the length of the string
        int counter = 0;
        /*create counter variable that will stop the string checking process when
        the string ends*/
        while (counter < length) {
            if (!Character.isLetter(a.charAt(counter))) {
                t = false;
                break;
            }
            counter++;
        }
        //use while loop with a nested if statement to check the string
        if (counter==length)  {
        t = true;
        }
        /*use if statement to assign true to t if the string has no numbers or
        characters other than letters*/
        return t;
        //return boolean value stored in t
    }
    public static boolean main2( String b, int c) {
        //beginning of second method
        boolean t = true;
        int length = b.length();
        //determine the length of the string
        int counter = 0;
        while (counter < c) {
            if (counter == length) {
                break;
            }
            if (Character.isLetter(b.charAt(counter))) {
                counter++;
            }
            else {
                t = false;
                break;
            }
        }
        //use while loop with a nested if statement to check the string
        return t;
        //return boolean value stored in t
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // create the instance for using the scanner class in the main method
        System.out.print("Enter a string: ");
        // prompt the user to enter a string
        String string;
        // accept user input for a string
        while (true) {
            if (!myScanner.hasNextLine()) {
                System.out.print("Sorry, you did not enter a String variable. Try again: ");
                myScanner.nextLine();
            }
            else {
                string = myScanner.nextLine();
                break;                    
            }
        }
        // use a while loop with nested if statements to prevent invalid inputs
        boolean allLetters1 = main2(string);
        if (allLetters1==true) {
            System.out.println("All of the characters in the string are letters.");
        }
        else {
            System.out.println("Not all of the characters in the string are letters.");
        }
        //print out the output depending on whether or not all letters were entered
        System.out.print("Enter the number of characters you want to check: ");
        // prompt the user to enter the number of characters to be checked
        int d;
        // accept user input for the number of characters to be checked
        while (true) {
            if (!myScanner.hasNextInt()) {
                System.out.print("Sorry, you did not enter an integer variable. Try again: ");
                myScanner.next();
            }
            else {
                d = myScanner.nextInt();
                if (d < 0) {
                    System.out.print(" You must enter a number greater than 0. Try again: ");
                }
                else {
                    break;                    
                }
            }
        }
        // use a while loop with nested if statements to prevent invalid inputs
        boolean allLetters2 = main2(string,d);
        if (allLetters2==true) {
            System.out.println("All of the characters in this segment are letters.");
        }
        else {
            System.out.println("Not all of the charaacters in this segment are letters.");
        }
        //print out the output depending on whether or not all letters were entered
    }
}