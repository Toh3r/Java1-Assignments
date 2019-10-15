package assignment6_Inheritance;

//create abstract class
public abstract class Student {
	//create variables
	String name, grade;
	long id;
	
	//create constructor
	public Student() {}
	
	//create overridden constructor
	public Student(String name, long id) {
		this.name = name;
		this.id = id;
	}
	
	//create getters and setters
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String getGrade() {
		return grade; 
	}
	
	public void setGrade(String grade) {
		this.grade = grade; 
	}
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id; 
	}
	
	//create abstract calculate result class
	public abstract void calculateResult(int grade1, int grade2, int grade3);
	
	//create to string method
	public String toString() {
		return name + " " + id;
	}
}
