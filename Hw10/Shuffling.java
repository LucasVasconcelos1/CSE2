// Lucas Vasconcelos 10/31/15 hw10 Shuffling
/* This program will take a deck of 52 cards, represented by the array cards of Strings
and will print out all the cards in the deck, shuffle the whole deck of cards, 
then print out the cards in the deck, all shuffled, then pick out a hand 
(pick randomly 5 cards of deck) and print them out.*/
import java.util.Scanner;
// import the scanner class
public class Shuffling{
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println();
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
     //create a suitNames array
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
//create a rankNames array 
String[] cards = new String[52];
//create a cards array that will hold 52 elements (cards in a deck)
String[] hand = new String[5];
//create a hand array that will have 5 elements
for (int i=0; i<52; i++){
  cards[i]=rankNames[i%13]+suitNames[i/13];
}
//assign values to each of the elements of the cards array
printArray(cards);
//print out the values of the cards array by passing cards to the printArray method
System.out.println("Shuffled:");
shuffle(cards);
//shuffle the cards array by passing the array to the shuffle method
printArray(cards);
//print out the deck of cards that is now shuffled
System.out.println("Randomized hand!:");
hand = randomizeHand(cards);
//set your hand array equal to the array created in the randomizeHand method
for (int x=0; x<5; x++) {
    System.out.print(hand[x]+" ");
}
//print out your hand of five cards
System.out.println();
  }
  public static void printArray(String[] a) {
      for (int i=0; i<52; i++) {
          System.out.print(a[i]+" ");
      }
      System.out.println();
  }
  //create a method that prints out the values of the 52 cards in the deck
  public static void shuffle(String[] b) {
      for (int i=0; i<52; i++) {
          int d = (int) (Math.random()*52);
          String temp = b[i];
          if (d!=i) {
          b[i] = b[d];
          b[d] = temp;
          }
      }
      /* create a method that shuffles the deck of 52 cards*/
  }
  public static String[] randomizeHand(String[] c) {
      String[] y = new String[5];
      int t;
      for (int r=0; r<5; r++) {
          y[r] = c[r];
      }
      return y;
  }
  /*create a method that picks the first five cards from the shuffled deck, puts
  them into an array and returns that array*/
}