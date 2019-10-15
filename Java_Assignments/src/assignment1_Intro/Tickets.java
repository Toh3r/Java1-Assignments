package assignment1_Intro;

//import from API
import java.util.*;
import java.text.*;

//create public class
public class Tickets {
	
	//create main method
	public static void main(String[] args) {
		
		//Declare and create instance of Scanner and DecimalFormat classes
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("€#,##0.00");
		
		//Declare variables
		int aSeatsSold, bSeatsSold, cSeatsSold;
		double aSeatCost, bSeatCost, cSeatCost, totalCost;
		
		//Read number of tickets sold
		System.out.print("Please enter number of seat A tickets sold: ");
		aSeatsSold = input.nextInt();
		System.out.print("Please enter number of seat B tickets sold: ");
		bSeatsSold = input.nextInt();
		System.out.print("Please enter number of seat C tickets sold: ");
		cSeatsSold = input.nextInt();
		
		//Read Cost of tickets
		System.out.print("Enter price of A ticket: ");
		aSeatCost = input.nextDouble();
		System.out.print("Enter price of B ticket: ");
		bSeatCost = input.nextDouble();
		System.out.print("Enter price of C ticket: ");
		cSeatCost = input.nextDouble();
		
		//Calculate total cost
		totalCost =
		(aSeatsSold*aSeatCost)+(bSeatsSold*bSeatCost)+(cSeatsSold*cSeatCost);
		
		//Display Results
		System.out.println("\n \t \t Tickets Sold" + "\t Ticket Cost");
		System.out.println("\t \t ------------" + "\t -----------");
		System.out.println("A Tickets: \t \t" + aSeatsSold + "\t \t" +
		aSeatCost );
		System.out.println("B Tickets: \t \t" + bSeatsSold + "\t \t" +
		bSeatCost );
		System.out.println("C Tickets: \t \t" + cSeatsSold + "\t \t" +
		cSeatCost );
		System.out.println("\n\t\t\tTotal sales= " + df.format (totalCost));
		input.close();
	} // Close main
} // Close Class
