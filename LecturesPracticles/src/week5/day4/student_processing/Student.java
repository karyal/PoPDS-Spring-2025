package week5.day4.student_processing;

public class Student extends Person{
	private String course;
	private String level;
	
	//Constructors
	public Student() {
		this.course="";
		this.level="";
	}
	public Student(String course, String level) {
		this.course=course;
		this.level=level;
	}
	//Setters
	public void setCourse(String course) {
		this.course=course;
	}
	public void setLevel(String level) {
		this.level=level;
	}
	//Getters
	public String getCourse() {
		return this.course;
	}
	public String level() {
		return this.level;
	}
	//toString
	public String toString() {
		return super.toString()+", "+this.course+", "+this.level;
	}
}









