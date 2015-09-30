// Lucas Vasconcelos 09/20/15 lab04
// all comments pertain to coding in the line above them
// This program will utilize the random number generator (Math.random())
//to generate a random number which will coorespond to a card in a deck.
//The Program will use if statements to assign the suit name to a number
//and switch statements to assign card identities. Finally, the program will
//print out the name of the randomly selected card
public class CardGenerator {
 public static void main(String[] args){
    // Beginning of main method
    int card1 = (int)((Math.random() * 52) + 1);
    // Generate a random number beteween 1 and 52 using the math.random class 
    String nameOfSuit;
    // Declare the nameOfSuit variavble as a string
    String identityOfCard;
    // Declare the identityOfCard variable as a string
    if (card1 > 0 && card1 <= 13){ 
     nameOfSuit = "diamonds";
    }
    else if (card1 > 13 && card1 <= 26){
     nameOfSuit = "clubs";
    }
    else if (card1 > 26 && card1 <= 39){
     nameOfSuit = "Hearts";
    }
    else if (card1 > 39 && card1 <= 52){
     nameOfSuit = "Spades";
    }
    // Use an if statement with nested else if statements to determine
    //the suit of the card based off of the random number generated in
    //line 13
    switch( card1 ){
    case 1: 
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
    // Use a switch statement with 52 different cases, one for each possible
    //random number, to assign a string containing the name of a card to the 
    //"identityOfCard" variable as well as a suit to the "nameOfSuit" variable.
    //Finally each case will print the output telling you which card you picked
   }
   // End of main method
}
