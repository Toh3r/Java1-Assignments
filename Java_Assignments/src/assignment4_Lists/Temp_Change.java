package assignment4_Lists;

//Import Scanner from API
import java.util.*;
//Create temperature change class
public class Temp_Change {
	
	//create main
	public static void main(String[] args) {
		//Create new instance of scanner
		Scanner input = new Scanner(System.in);
		//Declare userChoice variable
		int userChoice;
		//create for loop to loop program
		for (int i = 0; i<100000; i++) {
			//Get input from user
			System.out.print("1. Celsius to Fahrenheit \n2. Fahrenheit to Celsius\n3. Exit\n");
			System.out.print("Choice: ");
			userChoice = input.nextInt();
			
			// Call method depending on selection
			if(userChoice == 1 ) {
				celsius();
			}
			else if (userChoice == 2 ) {
				farhenheit();
			}
			else if(userChoice == 3 ) {
			System.out.print("Program terminated\nByeeeeeeeeee");
			System.exit(0);
			}
			else{
			System.out.print("Please enter a valid selection\n\n");
			}
		}
		input.close();
	}
	
	//create celsius method
	static void celsius() {
		int userCelsius,fahr; //declare variables
		Scanner input1 = new Scanner(System.in); //create instance of scanner
		
		//get input from user
		System.out.print("Please enter tempreture: ");
		userCelsius = input1.nextInt();
		
		//calculate fahrenheit
		fahr = (9/5*userCelsius + 32);
		
		//print out fahernheit temperature for user
		System.out.print(userCelsius + " degrees celsius is " + fahr + " degrees fahrenheit\n\n");
		input1.close();
	}
	
	//create farenheit method
	static void farhenheit() {
		int userFahr,Cels; //declare variable
		Scanner input2 = new Scanner(System.in); //create new instance of scanner
		
		//get input from user
		System.out.print("Please enter tempreture: ");
		userFahr = input2.nextInt();
		
		//calculate celsius
		Cels = (9/5*(userFahr - 32));
		System.out.print(userFahr + " degrees fahrenheit is " + Cels + " degrees clesius\n\n");
		input2.close();
	}
}//close temp change class

