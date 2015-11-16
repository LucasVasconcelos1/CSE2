// Lucas Vasconcelos 11/15/15 hw Area
/* This program will practice array manipulation and implementing matrix transposition
on random matrices*/
import java.util.Scanner;
//import the scanner class
public class Transpose {
    // beginnning of class
    public static void main(String[] args) {
        Scanner myScanner =  new Scanner(System.in);
        // create instance for using the scanner class in this program
        System.out.print("Enter a positive integer value for height: ");
        int height;
        //get user input for the width
        while (true) {
            if (!myScanner.hasNextInt()) {
                System.out.print("Sorry, you did not enter an integer number. Try again: ");
                myScanner.next();
            }
            else {
                height = myScanner.nextInt();
                if (height < 0) {
                    System.out.print("Please only enter integer numbers greater than 0. Try again: ");
                }
                else {
                    break;                    
                }
            }
        }
        /*use a while loop with nested if-else statements to check for correct input
        for the height*/
        System.out.print("Enter a positive integer value for width: ");
        int width;
        //get user input for the length
        while (true) {
            if (!myScanner.hasNextInt()) {
                System.out.print("Sorry, you did not enter an integer number. Try again: ");
                myScanner.next();
            }
            else {
                width = myScanner.nextInt();
                if (width < 0) {
                    System.out.print("Please only enter integer numbers greater than 0. Try again: ");
                }
                else {
                    break;                    
                }
            }
        }
        /*use a while loop with nested if-else statements to check for correct input
        for the length*/        
        int[][] array = randomMatrix(width, height);
        /*set the array returned by the calling the randomMatrix method equal to 
        array so that we store the value for later use in the main method*/
        System.out.println("array1:");
        //make output a little neater
        printMatrix(array);
        //print the array and check to see if the array is rectangular or not
        int[][] transposedArray = transposeMatrix(array);
        /*call the transposeMatrix method while passing width and height to the method
        that returns a new two dimensional array in column major format that describes the transpose of that matrix.*/
        printMatrix(transposedArray);
        //print the array and check to see if the array is rectangular or not
    }
    public static int[][] randomMatrix(int a, int d) {
        int[][] array1 = new int[d][a];
        for (int c = 0; c<d; c++) {
            for (int b = 0; b<a; b++) {
                array1[c][b] = (int)((Math.random()*20)-10);
            }
        }
        /*use for a for loop with a nested for loop to fill the array with random values
        from -10 to 10*/
        return array1;
    }
    //create a method that accepts two integers and creates a 2D array
    public static void printMatrix(int[][] a) {
        for (int b = 0; b<a.length; b++) {
            System.out.print("Member "+b+":");
            if (b>0 && a[b].length!=a[b-1].length) {
                System.out.println("Warning! This 2D array is not rectangular!");
            }
            //use a nested if statement to check to see if the 2D array is rectangular
            for (int c = 0; c<a[b].length; c++) {
                System.out.print(" "+a[b][c]+" ");
            }
            System.out.println();
            System.out.println();
        }
        //use a for loop and a nested for loop to print out the array passed to the method
    }
    public static int[][] transposeMatrix(int[][] a ) {
        System.out.println("array1 TRANSPOSED:");
        int b = a.length;
        int e = (a[b-1].length);
        // set e to the length of each member array from the array passed to this method
        int[][] array2 = new int[e][b];
        /*create a 2D array that represents a transposed version of the 2D array matrix
        that was passed to this method*/
        for (int c = 0; c<e; c++) {
            for (int d = 0; d<b; d++) {
                array2[c][d] = a[d][c];
            }
        }
        /*fill the values of the new array created in this method with the 
        correct values cooresponding to the 2D array that was passed to this method
        in the transposed format*/
        return array2;
        //return the created array 
    }
}