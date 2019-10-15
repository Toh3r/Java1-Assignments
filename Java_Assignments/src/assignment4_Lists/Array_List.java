package assignment4_Lists;

//Import array library
import java.util.*;
//create array/link class
public class Array_List {
	
	//create main
	public static void main(String[] args) {
		Integer integer;
		
		//Declare ArrayList and LinkedList
		List<Integer> myList = new ArrayList<>();
		//List<Integer> myList = new LinkedList<>();
		
		//create for loop to add integers to ArrayList
		for (int i = 0; i < 10; i++) {
			//use math.random() to create random numbers
			integer = new Integer((int)(Math.random()*10));
			//use .add() to add integers to ArrayList
			myList.add(integer);//Autoboxing occurs here
		}
		
		//Create enhanced for loop to traverse array and display contents
		System.out.print("Original Array: ");
		for (Integer n : myList) {
		System.out.print(n + " ");//Auto-unboxing occurs here
		}
		
		//Remove index zero from ArrayList
		myList.remove(0);
		System.out.print("\n\nNew Array: ");
		//Create enhanced for loop to traverse array and display contents
		for (Integer n : myList) {
		System.out.print(n + " ");//Auto-unboxing occurs here
		}
	}
}
