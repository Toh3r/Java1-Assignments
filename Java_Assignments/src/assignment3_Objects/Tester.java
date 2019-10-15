package assignment3_Objects;

import java.util.Scanner;

//Create Tester class
public class Tester{
	//Create main
	public static void main(String[] args) {
		//Create instance of scanner
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		String sName;
		int idNum;
		
		//Create Array
		String[] studentInfo = new String[10];
		
		//Get input from user
		System.out.print("Please enter your name: ");
		sName = input.nextLine();
		System.out.print("Please enter your I.D number: ");
		idNum = input.nextInt();
		
		//Set variables
		Student Studentname = new Student(sName);
		Student StudentID = new Student (idNum);
		
		//Print to screen
		System.out.print(Studentname.getName());
		System.out.print("\n" + StudentID.tostring());
		studentInfo[0] = Studentname.getName();
		studentInfo[1] = Studentname.tostring();
		System.out.println(studentInfo);
		
		input.close();//close Scanner
	}
}
