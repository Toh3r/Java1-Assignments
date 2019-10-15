package assignment6_Inheritance;

import java.util.*;

//create student client class
public class StudentClient {
	//create main
	public static void main(String[] args) {
		//create new instance of scanner
		Scanner input = new Scanner(System.in);
		List<String> sList = new ArrayList<>();
		
		//create variables
		String sName;
		long sId;
		int choice, grade1, grade2, grade3, avg;
		
		//create loop to get input 3 times
		for(int i = 0; i < 3; i++) {
			//Get input from user
			System.out.print("\nEnter 1 if Undergrad, enter 2 if Postgrad: ");
			choice = input.nextInt();
			if(choice == 1) {
				System.out.print("Please enter your name: ");
				sName = input.next();
				System.out.print("Please enter your id: ");
				sId = input.nextLong();
				System.out.print("Please enter your first grade: ");
				grade1 = input.nextInt();
				System.out.print("Please enter your second grade: ");
				grade2 = input.nextInt();
				System.out.print("Please enter your third grade: ");
				grade3 = input.nextInt();
				
				avg = ((grade1 + grade2 + grade3) / 3 );
				String sAvg = Integer.toString(avg);
				
				//create new undergrad
				Student under = new Undergrad(sName, sId);
				Undergrad grade = new Undergrad();
				
				//add input to array
				sList.add("");
				sList.add(under.toString());
				sList.add(sAvg);
				grade.calculateResult(grade1, grade2, grade3);
			}
			else if(choice == 2) {
				System.out.print("Please enter your name: ");
				sName = input.next();
				System.out.print("Please enter your id: ");
				sId = input.nextLong();
				System.out.print("Please enter your first grade: ");
				grade1 = input.nextInt();
				System.out.print("Please enter your second grade: ");
				grade2 = input.nextInt();
				System.out.print("Please enter your third grade: ");
				grade3 = input.nextInt();
				
				avg = ((grade1 + grade2 + grade3) / 3 );
				String sAvg = Integer.toString(avg);
				
				Student post = new Postgrad(sName, sId);
				Student grade = new Postgrad();
				
				sList.add("");
				sList.add(post.toString());
				sList.add(sAvg);
				grade.calculateResult(grade1, grade2, grade3);
			}
			else {
				System.out.println("That is not a valid selection");
			}
		}
		
		//print array
		for(int n = 0; n<9; n += 3){
			System.out.println("\n" + sList.get(n) + "Name + ID: " +
			sList.get(n + 1)
			+ ", Grade Average: " + sList.get(n + 2));
		}
		input.close();
	}
}
