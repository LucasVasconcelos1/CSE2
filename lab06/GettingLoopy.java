// Lucas Vasconcelos 10/13/15 lab06 GettingLoopy
// all comments pertain to coding in the line above them or adjacent to them
// This program will 


public class GettingLoopy {
    // beginnning of class
    public static void main(String[] args) {
        // beginning of the main method
        int i=1;
        //declare i as an int and assign it the value 0
        int j=7;
        //declare j as an int and assign it the value 7
        System.out.println();
        System.out.println("Step 1: ");
        //making the output more clear
        while (i<j) {
            System.out.print(i);
            i++;
        }
        int u=1;
        //declare u as an int and assign it the value 0
        int x=7;
        while (u<x) {
            System.out.print(i);
            u++;
        }
        System.out.println();
        //making the output more clear
        int t=10;
        int y=2;
        int r;
        // initialize the values used in the loops to find prime numbers
        System.out.println();
        System.out.println("Step 2: ");
        System.out.print("WHILE LOOP:");
        while (t<=100) {
            r=t%y;
            if (y==t) {
                System.out.print(" "+t+" ");
                t++;
                y=2;
                continue;
            }
            else if (y<t && r!=0) {
                y++;
            }
            else if (r==0) {
                t++;
                y=2;
            }
        }
        System.out.println();
        //use while loop to find prime numbers between 10 and 100 and print them out
        System.out.print("FOR LOOP:");
        for(t=10; t<=100; ) {
            r=t%y;
            if (y==t) {
                System.out.print(" "+t+" ");
                t++;
                y=2;
                continue;
            }
            else if (y<t && r!=0) {
                y++;
            }
            else if (r==0) {
                t++;
                y=2;
            }
        }
        System.out.println();
        //use for loop to find prime numbers between 10 and 100 and print them out
        System.out.print("DO WHILE LOOP:");
        t=10;
        y=2;
        // reset values of t and y
        do{
            r=t%y;
            if (y==t) {
                System.out.print(" "+t+" ");
                t++;
                y=2;
                continue;
            }
            else if (y<t && r!=0) {
                y++;
            }
            else if (r==0) {
                t++;
                y=2;
            }
        } while (t<=100);
        System.out.println();
        //use do-while loop to find prime numbers between 10 and 100 and print them out
        System.out.println();
        System.out.println("Step 3:");
        int b=0;
        int c=0;
        for (int a=0; a<((int)(Math.random()*195) + 5); a++) {
            if (c<20) {
                System.out.print("<3 ");
                c++;
            }
            if (c==20) {
                System.out.println();
                System.out.print("<3 ");
                c=1;
                
            }
        }
        //use for loop to print out a random number of "<3" symbols generated using
        // the math.random() method while limiting the output to 20 "<3" per line
        //using nested if statements
        System.out.println();
    }
}   