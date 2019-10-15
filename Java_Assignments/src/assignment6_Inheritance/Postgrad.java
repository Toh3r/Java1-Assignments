package assignment6_Inheritance;

public class Postgrad extends Student {
	//create constructor
	public Postgrad() {}
	
	//create overridden constructor
	public Postgrad(String name, long id) {
		this.name = name;
		this.id = id;
	}
	
	//override from super
	@Override
	public void calculateResult(int grade1, int grade2, int grade3) {
		int grade = ((grade1 + grade2 + grade3) / 3 );
		if (grade < 50) {
			System.out.print("Average grade: " + grade + ", You have failed");
		}
		else {
			System.out.print("Average grade: " + grade + ", You have Passed");
		}
	}
}