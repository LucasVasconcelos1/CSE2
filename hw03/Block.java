// Lucas Vasconcelos 09/14/15 hw03 part 2
// all comments pertain to coding in the lines above them
// this program will use the scanner class for user input 
//for the length, width, and height of a block, and then will
//calculate and print out the volume and surface area
import java.util.Scanner;
// import statement for the Scanner class for use later on
public class Block {
// beginning of class
    public static void main(String[] args) {
// beginning of main method
Scanner myScanner = new Scanner( System.in );
// construct the instance of Scanner which tells Scanner that 
//you are creating an instance that will take input from STDIN
//later on.
System.out.print("Enter the length of the block: ");
// prompt user for the length of the block
double blockLength = myScanner.nextDouble();
// accept user input for the length of the block
System.out.print("Enter the width of the block: ");
// prompt user for the width of the block
double blockWidth = myScanner.nextDouble();
// accept user input for the width of the block
System.out.print("Enter the height of the block: ");
// prompt user for the height of the block
double blockHeight = myScanner.nextDouble();
// accept user input for the height of the block
double surfaceArea = ((blockLength * blockHeight) * 6);
// declare variable waitTime as int and assign a value
//(dinnerTime-currentTime) to it
double blockVolume = (blockLength * blockWidth * blockHeight);
// get total number of minutes until dinner time and 
//then do % 60 to get remaining minutes
System.out.println("The surface area of the block of dimensions "+blockLength+" x "+blockWidth+" x "+blockHeight+" is "+surfaceArea+".");
// print out the calculated value of the surface area of the block in a sentence
System.out.println("The volume of the block of dimensions "+blockLength+" x "+blockWidth+" x "+blockHeight+" is "+blockVolume+".");
// print out the calculated value of the volume of the block in a sentence
    }
// end of main method 
}
// end of class
