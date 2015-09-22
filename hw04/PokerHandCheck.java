// Lucas Vasconcelos 09/21/15 hw04
// all comments pertain to coding in the line above them
// This program will randomly produce five numbers from 1-52
//that will coorespond to a card from five different decks.
//The program will then detect whether the five cards contain
//a pair, two pair, or three of a kind. If none of these
//special hands exist, the program will report that you 
//have a “high card hand”.
import java.util.Scanner;
//import Scanner class
import java.lang.*;
//import all of java.lang
public class PokerHandCheck { 
// begin class
    public static void main(String[] args) {
// beginning of main method
        java.lang.Math.random();
        String nameOfSuit;
// declare nameOfSuit variable as a string
        String identityOfCard;
// declare identityOfCard variable as a string
int card1 = (int)((Math.random() * 52) + 1);
// declare card1 as an integer and generate a random 
//double number (will be converted to an int) between
//1 and 52 for to be assigned to card1
switch( card1 ){
// switch statement with 52 cases that will determine which
//case will be evaluated and which statements will be executed
    case 1:
// each case determines the identity of the card drawn as well
//as the suit of the card. Then it prints the output in a sentence.
     identityOfCard="ace";
     nameOfSuit = "diamonds";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 2: 
     identityOfCard="2";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 3: 
     identityOfCard="3";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 4: 
     identityOfCard="4";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 5: 
     identityOfCard="5";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 6: 
     identityOfCard="6";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 7: 
     identityOfCard="7";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 8: 
     identityOfCard="8";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 9: 
     identityOfCard="9";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 10: 
     identityOfCard="10";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 11: 
     identityOfCard="jack";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 12: 
     identityOfCard="queen";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 13: 
     identityOfCard="king";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 14: 
     identityOfCard="ace";
     nameOfSuit = "clubs";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 15: 
     identityOfCard="2";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 16: 
     identityOfCard="3";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 17: 
     identityOfCard="4";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 18: 
     identityOfCard="5";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 19: 
     identityOfCard="6";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 20: 
     identityOfCard="7";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 21: 
     identityOfCard="8";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 22: 
     identityOfCard="9";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 23: 
     identityOfCard="10";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 24: 
     identityOfCard="jack";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 25: 
     identityOfCard="queen";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 26: 
     identityOfCard="king";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 27: 
     identityOfCard="ace";
     nameOfSuit = "hearts";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 28: 
     identityOfCard="2";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 29: 
     identityOfCard="3";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 30: 
     identityOfCard="4";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 31: 
     identityOfCard="5";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 32: 
     identityOfCard="6";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 33: 
     identityOfCard="7";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 34: 
     identityOfCard="8";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 35: 
     identityOfCard="9";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 36: 
     identityOfCard="10";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 37: 
     identityOfCard="jack";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 38: 
     identityOfCard="queen";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 39: 
     identityOfCard="king";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 40: 
     identityOfCard="ace";
     nameOfSuit = "spades";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 41: 
     identityOfCard="2";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 42: 
     identityOfCard="3";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 43: 
     identityOfCard="4";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 44: 
     identityOfCard="5";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 45: 
     identityOfCard="6";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 46: 
     identityOfCard="7";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 47: 
     identityOfCard="8";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 48: 
     identityOfCard="9";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 49: 
     identityOfCard="10";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 50: 
     identityOfCard="jack";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 51: 
     identityOfCard="queen";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 52: 
     identityOfCard="king";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    }
int card2 = (int)((Math.random() * 52) + 1);
// declare card2 as an integer and generate a random 
//double number (will be converted to an int) between
//1 and 52 for to be assigned to card2
switch( card2 ){
// switch statement with 52 cases that will determine which
//case will be evaluated and which statements will be executed
    case 1:
// each case determines the identity of the card drawn as well
//as the suit of the card. Then it prints the output in a sentence. 
     identityOfCard="ace";
     nameOfSuit = "diamonds";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 2: 
     identityOfCard="2";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 3: 
     identityOfCard="3";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 4: 
     identityOfCard="4";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 5: 
     identityOfCard="5";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 6: 
     identityOfCard="6";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 7: 
     identityOfCard="7";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 8: 
     identityOfCard="8";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 9: 
     identityOfCard="9";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 10: 
     identityOfCard="10";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 11: 
     identityOfCard="jack";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 12: 
     identityOfCard="queen";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 13: 
     identityOfCard="king";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 14: 
     identityOfCard="ace";
     nameOfSuit = "clubs";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 15: 
     identityOfCard="2";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 16: 
     identityOfCard="3";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 17: 
     identityOfCard="4";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 18: 
     identityOfCard="5";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 19: 
     identityOfCard="6";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 20: 
     identityOfCard="7";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 21: 
     identityOfCard="8";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 22: 
     identityOfCard="9";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 23: 
     identityOfCard="10";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 24: 
     identityOfCard="jack";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 25: 
     identityOfCard="queen";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 26: 
     identityOfCard="king";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 27: 
     identityOfCard="ace";
     nameOfSuit = "hearts";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 28: 
     identityOfCard="2";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 29: 
     identityOfCard="3";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 30: 
     identityOfCard="4";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 31: 
     identityOfCard="5";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 32: 
     identityOfCard="6";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 33: 
     identityOfCard="7";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 34: 
     identityOfCard="8";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 35: 
     identityOfCard="9";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 36: 
     identityOfCard="10";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 37: 
     identityOfCard="jack";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 38: 
     identityOfCard="queen";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 39: 
     identityOfCard="king";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 40: 
     identityOfCard="ace";
     nameOfSuit = "spades";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 41: 
     identityOfCard="2";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 42: 
     identityOfCard="3";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 43: 
     identityOfCard="4";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 44: 
     identityOfCard="5";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 45: 
     identityOfCard="6";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 46: 
     identityOfCard="7";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 47: 
     identityOfCard="8";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 48: 
     identityOfCard="9";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 49: 
     identityOfCard="10";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 50: 
     identityOfCard="jack";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 51: 
     identityOfCard="queen";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 52: 
     identityOfCard="king";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    }
int card3 = (int)((Math.random() * 52) + 1);
// declare card3 as an integer and generate a random 
//double number (will be converted to an int) between
//1 and 52 for to be assigned to card3
switch( card3 ){
// switch statement with 52 cases that will determine which
//case will be evaluated and which statements will be executed
    case 1:
// each case determines the identity of the card drawn as well
//as the suit of the card. Then it prints the output in a sentence. 
     identityOfCard="ace";
     nameOfSuit = "diamonds";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 2: 
     identityOfCard="2";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 3: 
     identityOfCard="3";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 4: 
     identityOfCard="4";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 5: 
     identityOfCard="5";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 6: 
     identityOfCard="6";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 7: 
     identityOfCard="7";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 8: 
     identityOfCard="8";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 9: 
     identityOfCard="9";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 10: 
     identityOfCard="10";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 11: 
     identityOfCard="jack";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 12: 
     identityOfCard="queen";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 13: 
     identityOfCard="king";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 14: 
     identityOfCard="ace";
     nameOfSuit = "clubs";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 15: 
     identityOfCard="2";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 16: 
     identityOfCard="3";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 17: 
     identityOfCard="4";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 18: 
     identityOfCard="5";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 19: 
     identityOfCard="6";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 20: 
     identityOfCard="7";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 21: 
     identityOfCard="8";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 22: 
     identityOfCard="9";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 23: 
     identityOfCard="10";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 24: 
     identityOfCard="jack";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 25: 
     identityOfCard="queen";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 26: 
     identityOfCard="king";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 27: 
     identityOfCard="ace";
     nameOfSuit = "hearts";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 28: 
     identityOfCard="2";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 29: 
     identityOfCard="3";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 30: 
     identityOfCard="4";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 31: 
     identityOfCard="5";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 32: 
     identityOfCard="6";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 33: 
     identityOfCard="7";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 34: 
     identityOfCard="8";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 35: 
     identityOfCard="9";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 36: 
     identityOfCard="10";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 37: 
     identityOfCard="jack";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 38: 
     identityOfCard="queen";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 39: 
     identityOfCard="king";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 40: 
     identityOfCard="ace";
     nameOfSuit = "spades";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 41: 
     identityOfCard="2";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 42: 
     identityOfCard="3";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 43: 
     identityOfCard="4";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 44: 
     identityOfCard="5";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 45: 
     identityOfCard="6";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 46: 
     identityOfCard="7";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 47: 
     identityOfCard="8";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 48: 
     identityOfCard="9";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 49: 
     identityOfCard="10";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 50: 
     identityOfCard="jack";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 51: 
     identityOfCard="queen";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 52: 
     identityOfCard="king";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    }
int card4 = (int)((Math.random() * 52) + 1);
// declare card4 as an integer and generate a random 
//double number (will be converted to an int) between
//1 and 52 for to be assigned to card4
switch( card4 ){
// switch statement with 52 cases that will determine which
//case will be evaluated and which statements will be executed
    case 1:
// each case determines the identity of the card drawn as well
//as the suit of the card. Then it prints the output in a sentence. 
     identityOfCard="ace";
     nameOfSuit = "diamonds";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 2: 
     identityOfCard="2";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 3: 
     identityOfCard="3";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 4: 
     identityOfCard="4";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 5: 
     identityOfCard="5";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 6: 
     identityOfCard="6";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 7: 
     identityOfCard="7";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 8: 
     identityOfCard="8";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 9: 
     identityOfCard="9";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 10: 
     identityOfCard="10";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 11: 
     identityOfCard="jack";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 12: 
     identityOfCard="queen";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 13: 
     identityOfCard="king";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 14: 
     identityOfCard="ace";
     nameOfSuit = "clubs";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 15: 
     identityOfCard="2";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 16: 
     identityOfCard="3";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 17: 
     identityOfCard="4";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 18: 
     identityOfCard="5";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 19: 
     identityOfCard="6";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 20: 
     identityOfCard="7";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 21: 
     identityOfCard="8";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 22: 
     identityOfCard="9";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 23: 
     identityOfCard="10";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 24: 
     identityOfCard="jack";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 25: 
     identityOfCard="queen";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 26: 
     identityOfCard="king";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 27: 
     identityOfCard="ace";
     nameOfSuit = "hearts";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 28: 
     identityOfCard="2";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 29: 
     identityOfCard="3";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 30: 
     identityOfCard="4";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 31: 
     identityOfCard="5";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 32: 
     identityOfCard="6";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 33: 
     identityOfCard="7";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 34: 
     identityOfCard="8";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 35: 
     identityOfCard="9";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 36: 
     identityOfCard="10";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 37: 
     identityOfCard="jack";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 38: 
     identityOfCard="queen";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 39: 
     identityOfCard="king";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 40: 
     identityOfCard="ace";
     nameOfSuit = "spades";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 41: 
     identityOfCard="2";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 42: 
     identityOfCard="3";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 43: 
     identityOfCard="4";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 44: 
     identityOfCard="5";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 45: 
     identityOfCard="6";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 46: 
     identityOfCard="7";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 47: 
     identityOfCard="8";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 48: 
     identityOfCard="9";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 49: 
     identityOfCard="10";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 50: 
     identityOfCard="jack";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 51: 
     identityOfCard="queen";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 52: 
     identityOfCard="king";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    }
int card5 = (int)((Math.random() * 52) + 1);
// declare card4 as an integer and generate a random 
//double number (will be converted to an int) between
//1 and 52 for to be assigned to card4
switch( card5 ){
// switch statement with 52 cases that will determine which
//case will be evaluated and which statements will be executed
//based on the random number generated
    case 1:
// each case determines the identity of the card drawn as well
//as the suit of the card. Then it prints the output in a sentence. 
     identityOfCard="ace";
     nameOfSuit = "diamonds";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 2: 
     identityOfCard="2";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 3: 
     identityOfCard="3";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 4: 
     identityOfCard="4";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 5: 
     identityOfCard="5";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 6: 
     identityOfCard="6";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 7: 
     identityOfCard="7";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 8: 
     identityOfCard="8";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 9: 
     identityOfCard="9";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 10: 
     identityOfCard="10";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 11: 
     identityOfCard="jack";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 12: 
     identityOfCard="queen";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 13: 
     identityOfCard="king";
     nameOfSuit = "diamonds";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 14: 
     identityOfCard="ace";
     nameOfSuit = "clubs";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 15: 
     identityOfCard="2";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 16: 
     identityOfCard="3";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 17: 
     identityOfCard="4";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 18: 
     identityOfCard="5";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 19: 
     identityOfCard="6";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 20: 
     identityOfCard="7";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 21: 
     identityOfCard="8";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 22: 
     identityOfCard="9";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 23: 
     identityOfCard="10";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 24: 
     identityOfCard="jack";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 25: 
     identityOfCard="queen";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 26: 
     identityOfCard="king";
     nameOfSuit = "clubs";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 27: 
     identityOfCard="ace";
     nameOfSuit = "hearts";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 28: 
     identityOfCard="2";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 29: 
     identityOfCard="3";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 30: 
     identityOfCard="4";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 31: 
     identityOfCard="5";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 32: 
     identityOfCard="6";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 33: 
     identityOfCard="7";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 34: 
     identityOfCard="8";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 35: 
     identityOfCard="9";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 36: 
     identityOfCard="10";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 37: 
     identityOfCard="jack";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 38: 
     identityOfCard="queen";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 39: 
     identityOfCard="king";
     nameOfSuit = "hearts";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 40: 
     identityOfCard="ace";
     nameOfSuit = "spades";
     System.out.println("You picked an "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 41: 
     identityOfCard="2";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 42: 
     identityOfCard="3";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 43: 
     identityOfCard="4";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 44: 
     identityOfCard="5";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 45: 
     identityOfCard="6";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 46: 
     identityOfCard="7";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 47: 
     identityOfCard="8";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 48: 
     identityOfCard="9";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 49: 
     identityOfCard="10";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 50: 
     identityOfCard="jack";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 51: 
     identityOfCard="queen";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    case 52: 
     identityOfCard="king";
     nameOfSuit = "spades";
     System.out.println("You picked a "+identityOfCard+" of "+nameOfSuit+".");
    break;
    }
int count = 0;
// initialize a variable to increment by 1 if a selection statement
//is excecuted. This will be used to print a high hand if the count still
//equals zero after all selection statements have been checked
if ( card1 % 13 == card2 % 13 & card1 % 13 == card3 % 13 ){ 
// selection statements with conditions of three of a kind in poker. If these
//conditions are met, the system will print "you have three of a kind" 
//and the count will increase by 1
    System.out.println("You have three of a kind!");
    count += 1;
}
else if ( card1 % 13 == card2 % 13 && card1 % 13 == card4 % 13 ){
    System.out.println("You have three of a kind!");
    count += 1;
}
else if ( card1 % 13 == card2 % 13 && card1 % 13 == card5 % 13 ){
    System.out.println("You have three of a kind!");
    count += 1;
}
else if ( card1 % 13 == card3 % 13 && card1 % 13 == card4 % 13 ){
    System.out.println("You have three of a kind!");
    count += 1;
}
else if ( card1 % 13 == card3 % 13 && card1 % 13 == card5 % 13 ){
    System.out.println("You have three of a kind!");
    count += 1;
}
else if ( card1 % 13 == card4 % 13 && card1 % 13 == card5 % 13 ){
    System.out.println("You have three of a kind!");
    count += 1;
}
else if ( card2 % 13 == card3 % 13 && card2 % 13 == card4 % 13 ){
    System.out.println("You have three of a kind!");
    count += 1;
}
else if ( card2 % 13 == card3 % 13 && card2 % 13 == card5 % 13 ){
    System.out.println("You have three of a kind!");
    count += 1;
}
else if ( card2 % 13 == card4 % 13 && card2 % 13 == card5 % 13 ){
    System.out.println("You have three of a kind!");
    count += 1;
}
else if ( card3 % 13 == card4 % 13 && card3 % 13 == card5 % 13 ){
    System.out.println("You have three of a kind!");
    count += 1;
}
else if ( card1 % 13 == card2 % 13 ){
// selection statements with conditions of a pair in poker. if these
//conditions are met, the system will print "you have a pair" and the count
//will increase by 1
    System.out.println("You have a pair!");
    count += 1;
}
else if ( card1 % 13 == card3 % 13 ){
    System.out.println("You have a pair!");
    count += 1;
}
else if ( card1 % 13 == card4 % 13 ){
    System.out.println("You have a pair!");
    count += 1; 
}
else if ( card1 % 13 == card5 % 13 ){
    System.out.println("You have a pair!");
    count += 1;
}
else if ( card2 % 13 == card3 % 13 ){ 
    System.out.println("You have a pair!");
    count += 1;
}
else if ( card2 % 13 == card4 % 13){
    System.out.println("You have a pair!");
    count += 1; 
}
else if ( card2 % 13== card5 % 13 ){
    System.out.println("You have a pair!");
    count += 1;
}
else if ( card3 % 13 == card4 % 13 ){
    System.out.println("You have a pair!");
    count += 1;
}
else if ( card3 % 13 == card5 % 13 ){
    System.out.println("You have a pair!");
    count += 1;
}
else if ( card4 % 13 == card5 % 13 ){
    System.out.println("You have a pair!");
    count += 1;
}
if ( count <= 0 ){
// selection statement that will print "you have a high hand" if none of the
//previous selection statements get evaluated
    System.out.println("You have a high hand!");
}
  } 
// end of main method
} 
// end of class