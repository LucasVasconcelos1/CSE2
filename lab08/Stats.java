// Lucas Vasconcelos 10/16/15 lab08 Stats
/* This program will ask the user to input 5 doubles, from smallest to largest.
compute the mean of the 5 doubles, the median of the 5 doubles, and then print 
out the mean and the median using three methods*/
import java.util.Scanner;
// import the scanner class
public class Stats {
    // beginnning of class
    public static void main(String[] args) {
        // beginning of the main method
        Scanner myScanner = new Scanner(System.in);
        // create the instance for using the scanner class in the main method
        System.out.print("Enter the first double number: ");
        double num1 = myScanner.nextDouble();
        // get user input for the first number
        System.out.print("Enter the second double number: ");
        double num2=myScanner.nextDouble();
        // get user input for the second number
        while (true) {
            if (num2<=num1) {
                System.out.print("Number 2 must be greater than number 1. Try again: ");
                num2=myScanner.nextDouble();
            }
            else {
                break;
            }
        }
        /* use if-else statements nested in a while loop to make sure 
        number 2 is greater than number 1*/
        System.out.print("Enter the third double number: ");
        double num3=myScanner.nextDouble();
        // get user input for the third number
        while (true) {
            if (num3<=num2) {
                System.out.print("Number 3 must be greater than number 2. Try again: ");
                num3 = myScanner.nextDouble();
            }
            else {
                break;
            }
        }
        /* use if-else statements nested in a while loop to make sure 
        number 3 is greater than number 2*/
        System.out.print("Enter the fourth double number: ");
        double num4=myScanner.nextDouble();
        // get user input for the fourth number
        while (true) {
            if (num4<=num3) {
                System.out.print("Number 4 must be greater than number 3. Try again: ");
                num4 = myScanner.nextDouble();
            }
            else {
                break;
            }
        }
        /* use if-else statements nested in a while loop to make sure 
        number 4 is greater than number 3*/
        System.out.print("Enter the fifth double number: ");
        double num5=myScanner.nextDouble();
        // get user input for the fifth number
        while (true) {
            if (num5<=num4) {
                System.out.print("Number 5 must be greater than number 4. Try again: ");
                num5 = myScanner.nextDouble();
            }
            else {
                break;
            }
        }
        /* use if-else statements nested in a while loop to make sure 
        number 5 is greater than number 4*/
        double mean = mean(num1, num2, num3, num4, num5);
        /* create a double variable named mean and assign the value returned when
        the mean method is called to the mean variable*/
        double median = median(num1, num2, num3, num4, num5);
        /* create a double variable named median and assign the value returned when
        the median method is called to the median variable*/
        print(mean, median);
        //call the print method that will print the output
    }
    public static double mean(double a, double b, double c, double d, double e) {
        double f = ((a+b+c+d+e)/5);
        return f;
    }
    //create mean method that returns the mean value of 5 doubles
    public static double median(double g, double h, double i, double j, double k) {
        return i;
    }
    //create median method that returns the median value of 5 doubles
    public static void print(double l, double m) {
        System.out.println("mean: "+l);
        System.out.println("median: "+m);
    }
    //create print method that prints out the mean and median
}
        