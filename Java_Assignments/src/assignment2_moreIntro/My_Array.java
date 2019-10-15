package assignment2_moreIntro;

//Import Scanner, Array and Decimal Format library from API
import java.util.*;
import java.text.*;

//Create Array Class
public class My_Array {
	
	//Create Main Class
	public static void main(String[] args) {
		
		//Declare and create instance of Scanner and Decimal Format
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#,##0.00");
		
		//Declare Variables
		int Array_Length;
		float Sum = 0;
		
		//Read Size of Array from user
		System.out.print("Please enter size of Array: ");
		Array_Length = input.nextInt();
		
		//Create array using input from user
		double[] My_Array = new double[Array_Length];
		
		//Read Array input from user using for loop
		for(int i = 0; i < Array_Length; i++){
			System.out.print("Enter value: ");
			//Add user values to array
			My_Array[i] = input.nextDouble();
		}
		
		//Display Array on console using for loop
		System.out.print("Your array values are: ");
		for(int i = 0; i < Array_Length; i++){
			System.out.print(My_Array[i] + " ");
			//Add contents of array
			Sum+=My_Array[i];
		}
		
		//Display sum of array on console
		System.out.print("\nThe sum of your array is: " + df.format (Sum));
		input.close();
		
	}//close main
}//close array class
