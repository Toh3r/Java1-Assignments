package assignment6_Inheritance;

public class Undergrad extends Student {
	
	//create constructor
	public Undergrad() {}
	
	//create overridden constructor
	public Undergrad(String name, long id) {
		this.name = name;
		this.id = id;
	}
	
	//override method from superclass
	@Override
	public void calculateResult(int grade1, int grade2, int grade3) {
		int sGrade = ((grade1 + grade2 + grade3) / 3 );
		if (sGrade < 40) {
			System.out.print("Average grade: " + sGrade + ", You have failed");
		}
		else {
			System.out.print("Average grade: " + sGrade + ", You have Passed");
		}
	}
}
