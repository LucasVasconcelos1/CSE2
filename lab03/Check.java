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
System.out.print("Enter the original cost of the check: $");
// prompt user for the original cost of the check
double checkCost = myScanner.nextDouble();
// accept user input for the total check cost and print output
System.out.print("Enter the percentage tip you wish to pay: ");
// prompt user for the percentage tip
double tipPercent = myScanner.nextDouble() / 100;
// accept user input for the tip percentage and print output
System.out.print("Enter the number of people who went out to dinner: ");
// prompt user for the number of people splitting the check
int numPeople = myScanner.nextInt();
// accept user input for the number of people splitting the check
double totalCost$ = ((double) checkCost * (1 + (double) tipPercent));
// 
double costPerPerson = (((double) totalCost$ / (int) numPeople) * 100);
// declaring variable cost per person as a double and assigning a value
//to it then deviding by 100 to cut off decimal values to the hundreth slot
double costPerPersonFinal = ((int) costPerPerson);
double costPerPersonFinal$ = (costPerPersonFinal / 100);
// declaring new cost per person variable as a double and multiplying
// the old costPerPerson by 100 to move the decimal and achieve a 
// number that makes sense for currency and payment.

System.out.println(" Each person must pay $"+costPerPersonFinal$+".");
// print out the final output telling us how much money each person
// must pay
    }
// end of main method
}
// end of class