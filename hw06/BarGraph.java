// Lucas Vasconcelos 10/04/15 Hw06 Bar Graph
// all comments pertain to coding in the line above them or adjacent to them
// This program will prompt user input for weekly spending
//amounts and then will print a bar graph vizualizing the data.
//Part two of this program will try to estimate the user's long
//term spending habits.
import java.util.Scanner;
// import scanner class
public class BarGraph {
public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
// Create instance for use of the scanner class to accept input
//from STDIN later in the program
System.out.print("Enter a value for Sunday's expendatures (in the form XX.XX): $");
// Prompt user to input a value for Sunday's spending habits
double sunday;
// Accept user input for Sunday's spending habits
while (true) {
    if (!myScanner.hasNextDouble()){
    System.out.print("Sorry, you did not enter a double. Try again: ");
    myScanner.next();
    }
    else {
        sunday = myScanner.nextDouble();
        if (sunday < 0) {
        System.out.print("Please only enter positive numbers. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
System.out.print("Enter a value for Monday's expendatures (in the form XX.XX): $");
// Prompt user to input a value for Monday's spending habits
double monday;
// Accept user input for Monday's spending habits
while (true) {
    if (!myScanner.hasNextDouble()){
    System.out.print("Sorry, you did not enter a double. Try again: ");
    myScanner.next();
    }
    else {
        monday = myScanner.nextDouble();
        if (monday < 0) {
        System.out.print("Please only enter positive numbers. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
System.out.print("Enter a value for Tuesday's expendatures (in the form XX.XX): $");
// Prompt user to input a value for Tuesday's spending habits
double tuesday;
// Accept user input for Tuesday's spending habits
while (true) {
    if (!myScanner.hasNextDouble()){
    System.out.print("Sorry, you did not enter a double. Try again: ");
    myScanner.next();
    }
    else {
        tuesday = myScanner.nextDouble();
        if (tuesday < 0) {
        System.out.print("Please only enter positive numbers. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
System.out.print("Enter a value for Wednesday's expendatures (in the form XX.XX): $");
// Prompt user to input a value for Wednesday's spending habits
double wednesday;
// Accept user input for Wednesday's spending habits
while (true) {
    if (!myScanner.hasNextDouble()){
    System.out.print("Sorry, you did not enter a double. Try again: ");
    myScanner.next();
    }
    else {
        wednesday = myScanner.nextDouble();
        if (wednesday < 0) {
        System.out.print("Please only enter positive numbers. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
System.out.print("Enter a value for Thursday's expendatures (in the form XX.XX): $");
// Prompt user to input a value for Thursday's spending habits
double thursday;
// Accept user input for Thursday's spending habits
while (true) {
    if (!myScanner.hasNextDouble()){
    System.out.print("Sorry, you did not enter a double. Try again: ");
    myScanner.next();
    }
    else {
        thursday = myScanner.nextDouble();
        if (thursday < 0) {
        System.out.print("Please only enter positive numbers. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
System.out.print("Enter a value for Friday's expendatures (in the form XX.XX): $");
// Prompt user to input a value for Friday's spending habits
double friday;
// Accept user input for Friday's spending habits
while (true) {
    if (!myScanner.hasNextDouble()){
    System.out.print("Sorry, you did not enter a double. Try again: ");
    myScanner.next();
    }
    else {
        friday = myScanner.nextDouble();
        if (friday < 0) {
        System.out.print("Please only enter positive numbers. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
System.out.print("Enter a value for Saturday's expendatures (in the form XX.XX): $");
// Prompt user to input a value for Saturday's spending habits
double saturday;
// Accept user input for Saturday's spending habits
while (true) {
    if (!myScanner.hasNextDouble()){
    System.out.print("Sorry, you did not enter a double. Try again: ");
    myScanner.next();
    }
    else {
        saturday = myScanner.nextDouble();
        if (saturday < 0) {
        System.out.print("Please only enter positive numbers. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
System.out.println("Expenses for Sunday: $"+sunday+".");
// Print out the sunday expenses
System.out.println("Expenses for Monday: $"+monday+".");
// Print out the monday expenses
System.out.println("Expenses for Tuesday: $"+tuesday+".");
// Print out the Tuesday expenses
System.out.println("Expenses for Wednesday: $"+wednesday+".");
// Print out the Wednesday expenses
System.out.println("Expenses for Thursday: $"+thursday+".");
// Print out the Thursday expenses
System.out.println("Expenses for Friday: $"+friday+".");
// Print out the Friday expenses
System.out.println("Expenses for Saturday: $"+saturday+".");
// Print out the Saturday expenses
int dollar = 0;
System.out.print("sunday: ");
while (sunday >= dollar) {
    System.out.print("*");
    dollar++;
}
System.out.println();
// Use a while loop to print out sunday's part of the bargraph made of *s for 
//every dollar of spending for that day
dollar = 0;
System.out.print("monday: ");
while (sunday >= dollar) {
    System.out.print("*");
    dollar++;
}
System.out.println();
// Use a while loop to print out monday's part of the bargraph made of *s for 
//every dollar of spending for that day
dollar = 0;
System.out.print("tuesday: ");
while (tuesday >= dollar) {
    System.out.print("*");
    dollar++;
}
System.out.println();
// Use a while loop to print out tuesday's part of the bargraph made of *s for 
//every dollar of spending for that day
dollar = 0;
System.out.print("wednesday: ");
while (wednesday >= dollar) {
    System.out.print("*");
    dollar++;
}
System.out.println();
// Use a while loop to print out wednesday's part of the bargraph made of *s for 
//every dollar of spending for that day
dollar = 0;
System.out.print("thursday: ");
while (thursday >= dollar) {
    System.out.print("*");
    dollar++;
}
System.out.println();
// Use a while loop to print out thursday's part of the bargraph made of *s for 
//every dollar of spending for that day
dollar = 0;
System.out.print("friday: ");
while (friday >= dollar) {
    System.out.print("*");
    dollar++;
}
System.out.println();
// Use a while loop to print out friday's part of the bargraph made of *s for 
//every dollar of spending for that day
dollar = 0;
System.out.print("saturday: ");
while (saturday >= dollar) {
    System.out.print("*");
    dollar++;
}
System.out.println();
// Use a while loop to print out saturday's part of the bargraph made of *s for 
//every dollar of spending for that day
double averageExpenses = (sunday + monday + tuesday + wednesday + thursday + friday + saturday);
// Calculate the average weekly expenses
averageExpenses = (int) (averageExpenses * 100);
double averageExp = averageExpenses / 100;
// Cut off the appropriate decimals for the week average
System.out.println("Your average weekly expenses are: $"+averageExp+".");
// Print out a sentence containing the weekly expenses
int weekCount = 0;
// Initialize the sentinel variable
double fourYearExp = 0;
// Declare the four year expenses value as zero on the outer scope
while (weekCount <= 208) {
    averageExpenses = (sunday + monday + tuesday + wednesday + thursday + friday + saturday);
    // Calculate the average weekly expenses
    int fluctuate = (int)((Math.random() * 40));
    // Generate a random number from 0 to 40
    switch (fluctuate) {
        case 0:
            averageExpenses = (averageExpenses - (averageExpenses * .2));
        break;
        case 1:
            averageExpenses = (averageExpenses - (averageExpenses * .19));
        break;
        case 2:
            averageExpenses = (averageExpenses - (averageExpenses * .18));
        break;
        case 3:
            averageExpenses = (averageExpenses - (averageExpenses * .17));
        break;
        case 4:
            averageExpenses = (averageExpenses - (averageExpenses * .16));
        break;
        case 5:
            averageExpenses = (averageExpenses - (averageExpenses * .15));
        break;
        case 6:
            averageExpenses = (averageExpenses - (averageExpenses * .14));
        break;
        case 7:
            averageExpenses = (averageExpenses - (averageExpenses * .13));
        break;
        case 8:
            averageExpenses = (averageExpenses - (averageExpenses * .12));
        break;
        case 9:
            averageExpenses = (averageExpenses - (averageExpenses * .11));
        break;
        case 10:
            averageExpenses = (averageExpenses - (averageExpenses * .1));
        break;
        case 11:
            averageExpenses = (averageExpenses - (averageExpenses * .09));
        break;
        case 12:
            averageExpenses = (averageExpenses - (averageExpenses * .08));
        break;
        case 13:
            averageExpenses = (averageExpenses - (averageExpenses * .07));
        break;
        case 14:
            averageExpenses = (averageExpenses - (averageExpenses * .06));
        break;
        case 15:
            averageExpenses = (averageExpenses - (averageExpenses * .05));
        break;
        case 16:
            averageExpenses = (averageExpenses - (averageExpenses * .04));
        break;
        case 17:
            averageExpenses = (averageExpenses - (averageExpenses * .03));
        break;
        case 18:
            averageExpenses = (averageExpenses - (averageExpenses * .02));
        break;
        case 19:
            averageExpenses = (averageExpenses - (averageExpenses * .01));
        break;
        case 20:
            averageExpenses = averageExpenses;
        break;
        case 21:
            averageExpenses = (averageExpenses + (averageExpenses * .01));
        break;
        case 22:
            averageExpenses = (averageExpenses + (averageExpenses * .02));
        break;
        case 23:
            averageExpenses = (averageExpenses + (averageExpenses * .03));
        break;
        case 24:
            averageExpenses = (averageExpenses + (averageExpenses * .04));
        break;
        case 25:
            averageExpenses = (averageExpenses + (averageExpenses * .05));
        break;
        case 26:
            averageExpenses = (averageExpenses + (averageExpenses * .06));
        break;
        case 27:
            averageExpenses = (averageExpenses + (averageExpenses * .07));
        break;
        case 28:
            averageExpenses = (averageExpenses + (averageExpenses * .08));
        break;
        case 29:
            averageExpenses = (averageExpenses + (averageExpenses * .09));
        break;
        case 30:
            averageExpenses = (averageExpenses + (averageExpenses * .1));
        break;
        case 31:
            averageExpenses = (averageExpenses + (averageExpenses * .11));
        break;
        case 32:
            averageExpenses = (averageExpenses + (averageExpenses * .12));
        break;
        case 33:
            averageExpenses = (averageExpenses + (averageExpenses * .13));
        break;
        case 34:
            averageExpenses = (averageExpenses + (averageExpenses * .14));
        break;
        case 35:
            averageExpenses = (averageExpenses + (averageExpenses * .15));
        break;
        case 36:
            averageExpenses = (averageExpenses + (averageExpenses * .16));
        break;
        case 37:
            averageExpenses = (averageExpenses + (averageExpenses * .17));
        break;
        case 38:
            averageExpenses = (averageExpenses + (averageExpenses * .18));
        break;
        case 39:
            averageExpenses = (averageExpenses + (averageExpenses * .19));
        break;
        case 40:
            averageExpenses = (averageExpenses + (averageExpenses * .2));
        break;
    // Use a switch statement with 40 different cases each cooresponding to 
    //one of the 40 possible random numbers generated that will multiply the
    // average by a factor between -.2 and .2 to create a new average for the week
    }
fourYearExp = (fourYearExp + averageExpenses);
// Calculate the four year expenses week by week
int fourYearExpense = (int) (fourYearExp * 100);
double fourYearExpenses = fourYearExpense / 100;
// Cut of the appropriate decimal values that are not needed
    if (weekCount == 208){
        System.out.println("Estimated expendature for 4 years: $"+fourYearExpenses+".");
        // Print out a sentence containing the value of the users estimated 4 year expendature
    }
weekCount++;
// Add one to the week count to simulate one week passing by
}
    } // End of main method
} // End of class