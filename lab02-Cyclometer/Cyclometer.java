// Lucas Vasconcelos 09/04/15 CSE2 
// This program will records two kinds of data: time elapsed (seconds), 
//and number of rotations of the front wheel during that time (counts).
// Using the data, the cyclometer will be able to compute total trip
//distances, counts, and times.
public class Cyclometer {
    	// main method required for every Java program
public static void main(String[] args) {
        // our input data.
    	int secsTrip1=480;  // integer variable. time elapsed data for trip1.
       	int secsTrip2=3220;  // integer variable. time elapsed data for trip1.
		int countsTrip1=1561;  // integer variable. ounts data for trip1.
		int countsTrip2=9037; // integer variable. counts data for trip2.
		//
		// my intermediate variables and output data.
		// these contain useful constants.
    double wheelDiameter=27.0;  // double variable. data for wheel diameter.
  	double PI=3.14159; // double variable, constant value of pi.
    int feetPerMile=5280;  // int variable constant ratio value feet:mile.
  	int inchesPerFoot=12;   // int variable constant ratio value inches:foot
  	int secondsPerMinute=60;  // int variable constant ratio value seconds:minute
	double distanceTrip1, distanceTrip2, totalDistance;  // define outputs as doubles.
       // prints out data stored in the variables along with text to form a sentence
       //stating trip time total (minutes) and trip count total (counts).
       System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	   System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
       distanceTrip1=countsTrip1*wheelDiameter*PI;
       // Above gives distance in inches
       //(for each count, a rotation of the wheel travels
       //the diameter in inches times PI)
	   distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
	   // Gives distance of trip1 in miles.
	   distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	   totalDistance=distanceTrip1+distanceTrip2; // Gives total combined distance.
	   //Print out the output data.
       System.out.println("Trip 1 was "+distanceTrip1+" miles");
	   System.out.println("Trip 2 was "+distanceTrip2+" miles");
	   System.out.println("The total distance was "+totalDistance+" miles"); 

	}  //end of main method   
} //end of class
