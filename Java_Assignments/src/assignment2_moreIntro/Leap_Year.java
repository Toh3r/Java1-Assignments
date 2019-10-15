package assignment2_moreIntro;

//Import Scanner from API
import java.util.*;

public class Leap_Year {
	
	public static void main(String[] args) {
		
		//Declare and create instance of scanner class
		Scanner input = new Scanner(System.in);
		//Declare variables
		int User_Year;
		int i = 0;
		
		//Create while loop to run program multiple times
		while (i < 5) {
			//Read Year from user
			System.out.print("Please enter a year: ");
			//Assign user number to variable
			User_Year = input.nextInt();
			
			//Use if else statement to determine and display if user number is a leap year
			if(User_Year % 400 == 0) {
				System.out.println(User_Year + " is a leap year.");
			} else if(User_Year % 100 == 0) {
				System.out.println(User_Year + " is not a leap year.");
			} else if (User_Year % 4 == 0) {
				System.out.println(User_Year + " is a leap year.");
			} else {
				System.out.println(User_Year + " is not a leap year.");
			}
			i++; //increment i
		}
		input.close();
	}
}
