// Lucas Vasconcelos 09/14/15 hw03 part 1
// all comments pertain to coding in the lines above them
// this program will use the scanner class for user input 
//for the time dinner will be eaten and the current time.
//the program will then calculate and print out the amount of
//time left before dinner
import java.util.Scanner;
// import statement for the Scanner class for use later on
public class Timer {
// beginning of class
    public static void main(String[] args) {
// beginning of main method
Scanner myScanner = new Scanner( System.in );
// construct the instance of Scanner which tells Scanner that 
//you are creating an instance that will take input from STDIN
//later on.
System.out.print("Enter the scheduled dinner time: ");
// prompt user for the scheduled dinner time
int dinnerTime = myScanner.nextInt();
// accept user input for the scheduled dinner time
System.out.print("Enter the current time: ");
// prompt user for the current time
int currentTime = myScanner.nextInt();
// accept user input for the current time
int waitTimeHours = ((dinnerTime-currentTime) / 100);
// declare variable waitTime as int and assign a value
//(dinnerTime-currentTime) to it
int waitTimeMinutes = ((dinnerTime-currentTime) % 60);
// get total number of minutes until dinner time and 
//then do % 60 to get remaining minutes
System.out.println("You have "+waitTimeHours+" hours and "+waitTimeMinutes+" minutes until dinner.");
// print out the calculated time until dinner and print the output
    }
// end of main method 
}
// end of class


