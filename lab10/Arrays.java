// Lucas Vasconcelos 10/30/15 lab10 Arrays
/* This program will create a string array and an int array and will print out
student names and grades on midterms using the arrays*/
import java.util.Scanner;
// import the scanner class
public class Arrays {
    // beginnning of class
     public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // create the instance for using the scanner class in the main method
        String[] students = new String[(int) Math.random()*5+5];
        //allocate space for this array of a random size between 5 and 10
        int myLength = students.length;
        // get the randomized length of the array
        System.out.println("Enter the students names: ");
        for(int i=0; i<myLength; i++) {
            students[i] = myScanner.nextLine();
        }
        //fill the array with names of students
        int[] midterm = new int[myLength];
        //create array for midterm exam grades that matches the size of the first array
        System.out.println("Enter the midterm scores for the students: ");
        for(int j=0; j<myLength; j++) {
            midterm[j] = myScanner.nextInt();
            if (midterm[j]<0 || midterm[j]>100) {
                System.out.print("Only enter integers from 0-100. Try again: ");
                midterm[j] = myScanner.nextInt();
            }
            // check to make sure there is valid input
        }
        //use for loop with a nested if statement to assign values to array members
        System.out.println("Here are the midterm grades of the students: ");
        for(int a=0; a<myLength; a++)
        System.out.println(students[a]+": "+ midterm[a]);
        //print out the final output
        
    }
}
        
