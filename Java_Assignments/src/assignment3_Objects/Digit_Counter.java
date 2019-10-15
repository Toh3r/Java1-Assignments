package assignment3_Objects;

//import scanner
import java.util.*;

//create class Digit_Counter
public class Digit_Counter {
	
	//create main method
	public static void main(String[] args) {
		
		//declare and create instance of scanner
		Scanner input = new Scanner(System.in);
		//print exit statement
		System.out.println("This program counts the number of digits" + " in an integer.\nEnter '-1' to finish.\n");
		
		//create for loop to repeat program
		for (int i = 0; i<100; i++) {
			//declare variables
			int userNum;
			String numstring;
			
			//Read number from user
			System.out.print("Please enter a number: ");
			userNum = input.nextInt();
			
			/*create if/else statement
			if user enters -1, terminate program*/
			if(userNum == (-1)){
				System.out.println("\nByeeee");
				System.exit(0);
			}
			else {
				//change integer to string so .length() can be used to count digits
				numstring = Integer.toString(userNum);
				//print result to console
				System.out.println("There is " + numstring.length() + " digits in " + userNum + "\n");
			}
		}//close if/else statement
		input.close();//close scanner
	}
}
