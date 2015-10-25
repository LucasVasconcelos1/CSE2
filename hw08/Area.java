// Lucas Vasconcelos 10/18/15 hw08 Area
/* This program will calculate the area of three different shapes; a rectangle,
a triangle and a circle using multiple methods*/
import java.util.Scanner;
// import the scanner class
public class Area {
    // beginnning of class
    public static double inputCheck(String shape){
        Scanner myScanner = new Scanner(System.in);
        // create the instance for using the scanner class in the inputCheck method
        double area = 0;
        if(shape.equals("rectangle")){
            System.out.print("Enter a double value for the height: ");
            // prompt the user to input a double number for a
            double height;
            // accept user input for a
            while (true) {
                if (!myScanner.hasNextDouble()) {
                    System.out.print("Sorry, you did not enter a double number. Try again: ");
                    myScanner.next();
                }
                else {
                    height = myScanner.nextDouble();
                    if (height < 0) {
                        System.out.print(" Please only enter doubles greater than 0. Try again: ");
                    }
                    else {
                        break;                    
                    }
                }
            }
            // use a while loop with nested if statements to prevent invalid inputs for height
            System.out.print("Enter a double value for the base: ");
            // prompt the user to input a double number for b
            double base;
            // accept user input for base
            while (true) {
                if (!myScanner.hasNextDouble()) {
                    System.out.print("Sorry, you did not enter a double number. Try again: ");
                    myScanner.next();
                }
                else {
                    base = myScanner.nextDouble();
                    if (base < 0) {
                        System.out.print(" Please only enter doubles greater than 0. Try again: ");
                    }
                    else {
                        break;                    
                    }
                }
            }
            // use a while loop with nested if statements to prevent invalid inputs for base
            area = rectangleA(height, base);
        }
        else if(shape.equals("triangle")) {
            System.out.print("Enter a double value for the height: ");
            // prompt the user to input a double number for a
            double height;
            // accept user input for a
            while (true) {
                if (!myScanner.hasNextDouble()) {
                    System.out.print("Sorry, you did not enter a double number. Try again: ");
                    myScanner.next();
                }
                else {
                    height = myScanner.nextDouble();
                    if (height < 0) {
                        System.out.print(" Please only enter doubles greater than 0. Try again: ");
                    }
                    else {
                        break;                    
                    }
                }
            }
            // use a while loop with nested if statements to prevent invalid inputs for height
            System.out.print("Enter a double value for the base: ");
            // prompt the user to input a double number for b
            double base;
            // accept user input for base
            while (true) {
                if (!myScanner.hasNextDouble()) {
                    System.out.print("Sorry, you did not enter a double number. Try again: ");
                    myScanner.next();
                }
                else {
                    base = myScanner.nextDouble();
                    if (base < 0) {
                        System.out.print(" Please only enter doubles greater than 0. Try again: ");
                    }
                    else {
                        break;                    
                    }
                }
            }
            // use a while loop with nested if statements to prevent invalid inputs for base
            area = triangleA(height, base);
        }
        else if(shape.equals("circle")) {
            System.out.print("Enter a double value for the radius: ");
            // prompt the user to input a double number for a
            double radius;
            // accept user input for a
            while (true) {
                if (!myScanner.hasNextDouble()) {
                    System.out.print("Sorry, you did not enter a double number. Try again: ");
                    myScanner.next();
                }
                else {
                    radius = myScanner.nextDouble();
                    if (radius < 0) {
                        System.out.print(" Please only enter doubles greater than 0. Try again: ");
                    }
                    else {
                        break;                    
                    }
                }
            }
            area = circleA(radius);
        }
        return area;
    }
    //create input check method that will calculate area and check inputs 
    public static double rectangleA(double a, double b) {
        return a*b;
    }
    public static double circleA(double c) {
        return (3.14*(c*c));
    }
    public static double triangleA(double e, double f) {
        return (e*f)/2;
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // create the instance for using the scanner class in the main method
        System.out.print("What type of shape would you like to choose: ");
        // prompt the user to pick a shape
        String shape;
        // accept user input for the type of shape
        while (true) {
            if (!myScanner.hasNextLine()) {
                System.out.print("Sorry, you did not enter a String variable. Try again: ");
                myScanner.next();
            }
            else {
                shape = myScanner.nextLine();
                if (!shape.equals("rectangle") && !shape.equals("circle") && !shape.equals("triangle")) {
                    System.out.print(" You must choose among a rectangle, a circle, and a triangle. Try again: ");
                }
                else {
                    break;                    
                }
            }
        }
        // use a while loop with nested if statements to prevent invalid inputs
        if (shape.equals("rectangle")) {
        double area = inputCheck(shape);
        System.out.println("The area of the rectangle is "+area+".");
        }
        //print out area of rectangle if shape is equal to rectangle
        else if (shape.equals("circle")) {
        double area = inputCheck(shape);
        System.out.println("The area of the circle is "+area+".");
        }
        //print out the area of a circle if shape is equal to circle
        else if (shape.equals("triangle")) {
        double area = inputCheck(shape);
        System.out.println("The area of the triangle is "+area+".");
        }
        //print out the area of a triangle if shape is equal to triangle
    } //end of main method
} //end of public class Area