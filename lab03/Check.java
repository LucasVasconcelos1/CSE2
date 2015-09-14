// Lucas Vasconcelos 09/11/15 lab03
// all comments pertain to coding in the line above them
// This program will use the Scanner class to allow user input
//for the total cost of a check, the percentage tip the user will
//pay, and the number of people who will split the check
// Finally the program will determine how much each person will
//need to pay
import java.util.Scanner;
// import the Scanner class for use later on in the program
public class Check  {
public static void main(String[] args)  {
// beginning of main method
    Scanner myScanner = new Scanner( System.in );
// construct the instance of Scanner which tells Scanner that 
//you are creating an instance that will take input from STDIN
double checkCost = myScanner.nextDouble();
// prompt user for the original cost of the check
System.out.print("Enter the original cost of the check "+(checkCost)+".");
// accept user input for the total check cost and print output
double tipPercent = myScanner.nextDouble() / 100;
// prompt user for the percentage tip
// convert the percentage into a decimal value
System.out.print("Enter the percentage tip you wish to pay "+tipPercent+".");
// accept user input for the tip percentage and print output
int numPeople = myScanner.nextInt();
// prompt user for the number of people splitting the check
System.out.print("Enter the number of people who went out to dinner "+numPeople+"." );
// accept user input for the number of people splitting the check
double totalCost$ = ((double) checkCost * (1 + (double) tipPercent));
// 
double costPerPerson = ((double) totalCost$ / (int) numPeople);
//
System.out.println(" Each person must pay "+costPerPerson+".");
//
    }
// end of main method
}
// end of class