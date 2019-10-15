package assignment5_Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Create Student Tester class
public class studentTester {
	
	//Create main
	public static void main(String[] args) {
			
		//create new instance of scanner
		Scanner input = new Scanner(System.in);
		//Create ArrayList
		List<Student> sList = new ArrayList<>();
		
		for(int t = 0; t<3; t++ ) {
			//Get input from user, create variables
			System.out.print("Please enter your name: ");
			String s_Name = input.next();
			
			System.out.print("Please enter your I.D: ");
			int s_ID = input.nextInt();
			
			System.out.print("Please enter your course: ");
			String s_Course = input.next();
			
			Student details = new Student(s_Name, s_ID, s_Course);
			
			//Add input to list
			sList.add(details);
		}
		
		//Traverse and print ArrayList using for loop
		for(Student n : sList) {
			System.out.print(n + "\n");
		}
		
		input.close();//close scanner
	}
}