package assignment3_Objects;

//create student class
class Student {
	//Create variables
	private String name;
	private int idNumber;
	
	public Student(String n) {
		setName(n);
	}
	public Student(int id) {
		setId(id);
	}
	
	//Set variables
	public void setName(String n) {
		name =n;
	}
	public void setId(int id) {
		idNumber = id;
	}
	//Return variables
	public String getName() {
		return name;
	}
	public int getId() {
		return idNumber;
	}
	public String tostring() {
		return String.format("%d", getId());
	}
}
