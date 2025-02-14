package week5.day5.student_processing;

public class Person {
	private int pid;
	private String fullName;
	//Constructors
	public Person() {
		this.pid=0;
		this.fullName="";
	}
	public Person(int pid, String fullName) {
		this.pid=pid;
		this.fullName=fullName;
	}
	//Setters
	public void setPID(int pid) {
		this.pid=pid;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	//Getters
	public int getPID() {
		return this.pid;
	}
	public String getFullName() {
		return this.fullName;
	}
	@Override
	public String toString() {
		return this.pid+", "+this.fullName;
	}
}
