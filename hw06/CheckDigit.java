// Lucas Vasconcelos 10/04/15 Hw06 Check Digit
// all comments pertain to coding in the line above them or adjacent to them
// This program will first prompt user input for a ten digit ISBN and then multiply 
//the first digit by 10, the second digit by 9, third digit by 8, and continue 
//decrementing until the 9th digit has been multiplied by 2. Finally it will find
//the summation of these multiplied numbers and divide them by 11. The ISBN is valid
//if the division results in an output that is equal to the last digit of the ISBN
import java.util.Scanner;
// Import the scanner class
public class CheckDigit{ // Beginning of the class
public static void main(String[] args){ // Beginning of the main method
    Scanner myScanner = new Scanner(System.in);
    //  Create instance for use of the scanner class to accept input
    //from STDIN later in the program
    System.out.print("Enter the first character of your ten digit ISBN: ");
    // Prompt user to input the first character of the ten digit ISBN
    int isbn;
    // Accept user input for the first character of the ten digit ISBN
    while (true) {
    if (!myScanner.hasNextInt()){
    System.out.print("Sorry, you did not enter an integer. Try again: ");
    myScanner.next();
    }
    else {
        isbn = myScanner.nextInt();
        if (isbn < 0 || isbn > 9) {
        System.out.print("Please only enter positive numbers between 0 and 9. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
    System.out.print("Enter another character of your ten digit ISBN: ");
    // Prompt user to input another character of the ten digit ISBN
    int isbn2;
    // Accept user input for another character of the ten digit ISBN
    while (true) {
    if (!myScanner.hasNextInt()){
    System.out.print("Sorry, you did not enter an integer. Try again: ");
    myScanner.next();
    }
    else {
        isbn2 = myScanner.nextInt();
        if (isbn2 < 0 || isbn2 > 9) {
        System.out.print("Please only enter positive numbers between 0 and 9. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
    System.out.print("Enter another character of your ten digit ISBN: ");
    // Prompt user to input another character of the ten digit ISBN
    int isbn3;
    // Accept user input for another character of the ten digit ISBN
    while (true) {
    if (!myScanner.hasNextInt()){
    System.out.print("Sorry, you did not enter an integer. Try again: ");
    myScanner.next();
    }
    else {
        isbn3 = myScanner.nextInt();
        if (isbn3 < 0 || isbn3 > 9) {
        System.out.print("Please only enter positive numbers between 0 and 9. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
    System.out.print("Enter another character of your ten digit ISBN: ");
    // Prompt user to input another character of the ten digit ISBN
    int isbn4;
    // Accept user input for another character of the ten digit ISBN
    while (true) {
    if (!myScanner.hasNextInt()){
    System.out.print("Sorry, you did not enter an integer. Try again: ");
    myScanner.next();
    }
    else {
        isbn4 = myScanner.nextInt();
        if (isbn4 < 0 || isbn4 > 9) {
        System.out.print("Please only enter positive numbers between 0 and 9. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
    System.out.print("Enter another character of your ten digit ISBN: ");
    // Prompt user to input another character of the ten digit ISBN
    int isbn5;
    // Accept user input for another character of the ten digit ISBN
    while (true) {
    if (!myScanner.hasNextInt()){
    System.out.print("Sorry, you did not enter an integer. Try again: ");
    myScanner.next();
    }
    else {
        isbn5 = myScanner.nextInt();
        if (isbn5 < 0 || isbn5 > 9) {
        System.out.print("Please only enter positive numbers between 0 and 9. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
    System.out.print("Enter another character of your ten digit ISBN: ");
    // Prompt user to input another character of the ten digit ISBN
    int isbn6;
    // Accept user input for another character of the ten digit ISBN
    while (true) {
    if (!myScanner.hasNextInt()){
    System.out.print("Sorry, you did not enter an integer. Try again: ");
    myScanner.next();
    }
    else {
        isbn6 = myScanner.nextInt();
        if (isbn6 < 0 || isbn6 > 9) {
        System.out.print("Please only enter positive numbers between 0 and 9. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
    System.out.print("Enter another character of your ten digit ISBN: ");
    // Prompt user to input another character of the ten digit ISBN
    int isbn7;
    // Accept user input for another character of the ten digit ISBN
    while (true) {
    if (!myScanner.hasNextInt()){
    System.out.print("Sorry, you did not enter an integer. Try again: ");
    myScanner.next();
    }
    else {
        isbn7 = myScanner.nextInt();
        if (isbn7 < 0 || isbn7 > 9) {
        System.out.print("Please only enter positive numbers between 0 and 9. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
    System.out.print("Enter another character of your ten digit ISBN: ");
    // Prompt user to input another character of the ten digit ISBN
    int isbn8;
    // Accept user input for another character of the ten digit ISBN
    while (true) {
    if (!myScanner.hasNextInt()){
    System.out.print("Sorry, you did not enter an integer. Try again: ");
    myScanner.next();
    }
    else {
        isbn8 = myScanner.nextInt();
        if (isbn8 < 0 || isbn8 > 9) {
        System.out.print("Please only enter positive numbers between 0 and 9. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
    System.out.print("Enter another character of your ten digit ISBN: ");
    // Prompt user to input another character of the ten digit ISBN
    int isbn9;
    // Accept user input for another character of the ten digit ISBN
    while (true) {
    if (!myScanner.hasNextInt()){
    System.out.print("Sorry, you did not enter an integer. Try again: ");
    myScanner.next();
    }
    else {
        isbn9 = myScanner.nextInt();
        if (isbn9 < 0 || isbn9 > 9) {
        System.out.print("Please only enter positive numbers between 0 and 9. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
    System.out.print("Enter another character of your ten digit ISBN: ");
    // Prompt user to input another character of the ten digit ISBN
    int isbn10;
    // Accept user input for another character of the ten digit ISBN
    while (true) {
    if (!myScanner.hasNextInt()){
    System.out.print("Sorry, you did not enter an integer. Try again: ");
    myScanner.next();
    }
    else {
        isbn10 = myScanner.nextInt();
        if (isbn10 < 0 || isbn10 > 9) {
        System.out.print("Please only enter positive numbers between 0 and 9. Try again: ");
        }
        else {
           break;
        }
    }
}
// Use while loops to prevent invalid inputs
    System.out.println("The ISBN number you entered is: "+isbn+""+isbn2+""+isbn3+""+isbn4+""+isbn5+""+isbn6+""+isbn7+""+isbn8+""+isbn9+""+isbn10+".");
    // Print out the isbn number obtained from user input
    isbn = isbn * 10;
    // multiply the first digit in the isbn number by 10
    isbn2 = isbn2 * 9;
    // multiply the second digit in the isbn number by 9
    isbn3 = isbn3 * 8;
    // Multiply the third digit in the isbn number by 8
    isbn4 = isbn4 * 7;
    // Multiply the fourth digit in the isbn number by 7
    isbn5 = isbn5 * 6;
    // Multiply the fifth digit in the isbn number by 6
    isbn6 = isbn6 * 5;
    // Multiply the sixth digit in the isbn number by 5
    isbn7 = isbn7 * 4;
    // Multiply the seventh digit in the isbn number by 4
    isbn8 = isbn8 * 3;
    // Multiply the eigth digit in the isbn number by 3
    isbn9 = isbn9 * 2;
    // Multiply the ninth digit in the isbn number by 2
    int checkDigit = ((isbn+isbn2+isbn3+isbn4+isbn5+isbn6+isbn7+isbn8+isbn9) % 11);
    // Declare your check digit for the isbn as an integer value that is assigned
    //the value of all of the multiplication functions above added together and
    //devided by 11.
    System.out.println("checkDigit: "+checkDigit);
    // Print out the value of your check digit
    if (checkDigit == isbn10) {
        System.out.println("This is a valid ISBN.");
    }
    // Print "This is a valid ISBN" if the conditions for a valid ISBN are met
    else if (checkDigit != isbn10){
        System.out.println("This is not a valid ISBN. Check digit should be "+isbn10+".");
    }
    // Print a statement saying the user inputted an invalid ISBN and give the correct
    //check digit for the inputted ISBN
  } // End of main method
} // End of the public class CheckDigit