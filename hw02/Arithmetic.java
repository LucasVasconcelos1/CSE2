// Lucas Vasconcelos hw02 09/06/15
// Below is a program to calculate the total cost of each kind 
//of item, sales tax for that total cost, total cost of 
//purchases (before tax), and the total actually paid 
//for this transaction, including sales tax.
public class Arithmetic{
public static void main(String[] args) {
// Declaring variable for number of pairs of socks.
int nSocks=3;
// Declaring variable for cost per pair of socks.
//(‘$’ is part of the variable name).
double sockCost$=2.58;
// Declaring int variable for number of drinking glasses.
int nGlasses=6;
// Declaring double variable for cost per glass.
double glassCost$=2.29;
// Declaring int variable for number of boxes of envelopes.
int nEnvelopes=1;
// Declaring double variable for cost per box of envelopes.
double envelopeCost$=3.25;
// Declaring double variable for constant tax percent in Pennsylvania.
double taxPercent=1.06;
// Declaring double variable for total cost of socks.
double totalSockCost$=(((nSocks*sockCost$)*(taxPercent)));
// Multiplying total sock cost by 100 and then
//explicitly casting double variable to int variable.
double endSCost$ = (int) (100*totalSockCost$);
// Deviding the total sock cost by 100 to cut off two decimal places
//and then storing the value in the newly declared double variable endSoCost$.
double endSoCost$= endSCost$/100;
// Printing the total sock cost in dollars, in a sentence.
System.out.println("The total cost of the socks is $" +endSoCost$+ " dollars.");
// Declaring double variable for total cost of glasses.
double totalGlassCost$=((nGlasses*glassCost$)*(taxPercent));
// Multiplying total glass cost by 100 and then explicitly
//casting the double totalGlassCost$ variable to an int variable.
double endGCost$= (int) ((100*totalGlassCost$));
// Deviding the total glass cost by 100 to cut off two decimal places
//and then storing the value in the new double variable.
double endGlCost$= endGCost$/100;
// Print the total glass cost in dollars, in a sentence.
System.out.println("The total cost of the glasses is $" +endGlCost$+ " dollars.");
// Declaring double variable for total cost of envelopes.
double totalEnvelopeCost$=((nEnvelopes*envelopeCost$)*(taxPercent));
// Multiplying total glass cost by 100 and then explicitly
//casting the double totalGlassCost$ variable to an int variable.
double endECost$= (int) ((100*totalEnvelopeCost$));
// Deviding the total envelope cost by 100 to cut off two decimal places
//and then storing the value in the new double variable.
double endEnCost$= endECost$/100;
// Print the total envelope cost in dollars, in a sentence.
System.out.println("The total cost of the envelopes is $" +endEnCost$+ " dollars.");
// Declaring double variable for total cost without sales tax and assigning a value.
double totalInitialCost$=((totalSockCost$+totalGlassCost$+totalEnvelopeCost$)/(taxPercent));
// Print the total cost before sales tax in dollars, in a sentence.(output)
System.out.println("The total cost before sales tax is $" +totalInitialCost$+ " dollars.");
// Declaring double variable for total cost including sales tax.
double totalFinalCost$=(totalSockCost$+totalGlassCost$+totalEnvelopeCost$);
// Multiplying total cost including sales tax by 100 and then explicitly
//casting the double totalFinalCost$ variable to an int variable.
double endFCost$= (int) ((100*totalFinalCost$));
// Deviding the total cost including sales tax by 100 to cut off two decimal places
//and then storing the value in the new double variable.
double endFiCost$= endFCost$/100;
// Print the total cost including sales tax in dollars, in a sentence.(output)
System.out.println("The total cost including sales tax is $" +endFiCost$+ " dollars.");
    }
}

