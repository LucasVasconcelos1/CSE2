// Lucas Vasconcelos 11/8/15 hw11 CSE2Linear
/* This program will prompt a user ot create an array with 15 students' grades 
entered using the scanner method, then search for a certain number, print out if
the number is found and if it is found, print out the number of iterations it took
to find it, finally, the program will repeat it self using a newly scrambled array*/
import java.util.Scanner;
// import the scanner class
public class CSE2Linear{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //create instance for using the scanner class
        int[] studentScores = new int[15];
        //create studentScores array that has 15 elements
        for(int q = 0; q<15; q++) {
            System.out.print("Enter a student's final CSE2 grade: ");
            int holder;
            while (true) {
                if (!myScanner.hasNextInt()) {
                    System.out.print("Sorry, you did not enter an integer number. Try again: ");
                    myScanner.next();
                    continue;
                }
                else {
                    holder = myScanner.nextInt();
                }
                while (true) {
                    if (holder > 100 || holder < 0) {
                        System.out.print("Please only enter integers from 0-100. Try again: ");
                        while (true) {
                            if (!myScanner.hasNextInt()) {
                            System.out.print("Sorry, you did not enter an integer number. Try again: ");
                            myScanner.next();
                            continue;
                            }
                            else {
                                break;
                            }
                        }
                        holder = myScanner.nextInt();
                    }
                    if (holder < 100 && holder > 0) {
                        break;
                    }
                }
                if (q>0) {
                    while (true) {
                        if (holder < studentScores[q-1]) {
                            System.out.print("Please make sure this student's score is greater than or equal to the previous student's score. Try again: ");
                            while (true) {
                                if (!myScanner.hasNextInt()) {
                                System.out.print("Sorry, you did not enter an integer number. Try again: ");
                                myScanner.next();
                                continue;
                                }
                                else {
                                    break;
                                }
                            }
                        holder = myScanner.nextInt();
                        if (holder > 100 || holder < 0) {
                            System.out.print("Please only enter integers from 0-100. Try again: ");
                            while (true) {
                                if (!myScanner.hasNextInt()) {
                                System.out.print("Sorry, you did not enter an integer number. Try again: ");
                                myScanner.next();
                                continue;
                                }
                                else {
                                    break;
                                }
                        }
                        holder = myScanner.nextInt();
                    }
                        }
                        else {
                            studentScores[q] = holder;
                            break;
                        }
                    }
                }
                if (q==0) {
                    studentScores[q] = holder;
                    break;
                }
                if (true) {
                    break;
                }
            }
        }
        /*use a series of nested if statements, and while loops inside of a for loop
        to check to make sure we get correct user input for the studentScores arrray*/
        System.out.println("Sorted: ");
        //make the output neater by printing out sorted:
        for (int g=0; g<15; g++) {
            System.out.print(studentScores[g]+" ");
        }
        //use a for loop to print out the values held by each element of the array
        System.out.println();
        //make the output look neat after printing out the array
        System.out.print("Enter a grade to be searched for: ");
        int searchGrade = myScanner.nextInt();
        //get user input for a grade to be searched for
        int q = 7;
        /*create variable q in the main method outer most scope that will be used as the
        middle of the studentScores[] array so we can begin our binary search*/
        while (true) {
            if (studentScores[q] == searchGrade) {
                System.out.println(searchGrade+" was found with one iteration.");
                break;
            }
            else if (studentScores[q] < searchGrade) {
                q = 11;
                if (studentScores[q] == searchGrade) {
                    System.out.println(searchGrade+" was found with two iterations.");
                    break;
                }
                else if (studentScores[q] < searchGrade) {
                    q = 13;
                    if (studentScores[q] == searchGrade) {
                        System.out.println(searchGrade+" was found with three iterations.");
                        break;
                    }
                    else if (studentScores[q] < searchGrade) {
                        q = 14;
                        if (studentScores[q] == searchGrade) {
                            System.out.println(searchGrade+" was found with four iterations");
                            break;
                        }
                        else {
                            System.out.println(searchGrade+" was not found with four iterations");
                            break;
                        }
                    }
                    else if (studentScores[q] > searchGrade) {
                        q = 12;
                        if(studentScores[q] == searchGrade) {
                            System.out.println(searchGrade+" was found with four iterations");
                            break;
                        }
                        else {
                            System.out.println(searchGrade+" was not found with four iterations");
                            break;
                        }
                    }
                }
                else if (studentScores[q] > searchGrade) {
                    q = 9;
                    if (studentScores[q] == searchGrade) {
                        System.out.println(searchGrade+" was found with three iterations.");
                        break;
                    }
                    else if (studentScores[q] < searchGrade) {
                        q = 10;
                        if (studentScores[q] == searchGrade) {
                            System.out.println(searchGrade+" was found with four iterations");
                            break;
                        }
                        else {
                            System.out.println(searchGrade+" was not found with four iterations");
                            break;
                        }
                    }
                    else if (studentScores[q] > searchGrade) {
                        q = 8;
                        if(studentScores[q] == searchGrade) {
                            System.out.println(searchGrade+" was found with four iterations");
                            break;
                        }
                        else {
                            System.out.println(searchGrade+" was not found with four iterations");
                            break;
                        }
                    }                    
                }
            }
            else if (studentScores[q] > searchGrade) {
                q = 3;
                if (studentScores[q] == searchGrade) {
                    System.out.println(searchGrade+" was found with two iterations.");
                    break;
                }
                else if (studentScores[q] < searchGrade) {
                    q = 5;
                    if (studentScores[q] == searchGrade) {
                        System.out.println(searchGrade+" was found with three iterations.");
                        break;
                    }
                    else if (studentScores[q] < searchGrade) {
                        q = 6;
                        if (studentScores[q] == searchGrade) {
                            System.out.println(searchGrade+" was found with four iterations");
                            break;
                        }
                        else {
                            System.out.println(searchGrade+" was not found with four iterations");
                            break;
                        }
                    }
                    else if (studentScores[q] > searchGrade) {
                        q = 4;
                        if(studentScores[q] == searchGrade) {
                            System.out.println(searchGrade+" was found with four iterations");
                            break;
                        }
                        else {
                            System.out.println(searchGrade+" was not found with four iterations");
                            break;
                        }
                    }
                }
                else if (studentScores[q] > searchGrade) {
                    q = 1;
                    if (studentScores[q] == searchGrade) {
                        System.out.println(searchGrade+" was found with three iterations.");
                        break;
                    }
                    else if (studentScores[q] < searchGrade) {
                        q = 2;
                        if (studentScores[q] == searchGrade) {
                            System.out.println(searchGrade+" was found with four iterations");
                            break;
                        }
                        else {
                            System.out.println(searchGrade+" was not found with four iterations");
                            break;
                        }
                    }
                    else if (studentScores[q] > searchGrade) {
                        q = 0;
                        if (studentScores[q] == searchGrade) {
                            System.out.println(searchGrade+" was found with four iterations");
                            break;
                        }
                        else {
                            System.out.println(searchGrade+" was not found with four iterations");
                            break;
                        }
                    }                    
                }
            }
        }
/*use nested if-else statements to perform a binary search of my sorted studentScores[] array
and print out whether or not the value being searched for was found and if how many iterations it took*/
        System.out.println("Scrambled: ");
        //make the output neat by printing scrambled:
        for (int i=0; i<15; i++) {
          int d = (int) (Math.random()*15);
          int temp = studentScores[i];
          if (d!=i) {
          studentScores[i] = studentScores[d];
          studentScores[d] = temp;
          }
        }
        //shuffle the values of my array studentScores using a for loop and the math.random method
        for (int f=0; f<15; f++) {
            System.out.print(studentScores[f]+" ");
        }
        //use a for loop to print out the newly scrambled studentScores[] array
        System.out.println();
        //go to the next line after printing out the values of each element of the array
        int iCount = 1;
        /*create a counter variable that will be used in printing out the number of
        iterations through the loop it took to finish searching*/
        System.out.print("Enter a grade to be searched for: ");
        searchGrade = myScanner.nextInt();
        //get user input for a grade to be searched for
        for (int w = 0; w<15; w++) {
            if (studentScores[w] == searchGrade) {
                System.out.println(searchGrade+" was found with "+iCount+" iterations.");
                break;
            }
            if (w==14 && studentScores[w] != searchGrade) {
                System.out.println(searchGrade+" was not found with 15 iterations.");
            }
            iCount++;
        }
        /*use a for loop with nested if statements to perform a linear search of the scrambled
        studentScores[] array for a user inputed score.*/
    }
}