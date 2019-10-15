package assignment5_Constructors;

//Create public class Student
class Student {
	
	//create private data members
	private String name;
	private int id;
	private String course;
	
	//create constructor
	public Student() {}
	
	//create overloaded constructor
	public Student(String name, int id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}
	
	//Create getters and setters for private data members
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	//Override toString method
	@Override
	public String toString() {
		return name +" "+ id +" "+ course;
	}
}//close class

