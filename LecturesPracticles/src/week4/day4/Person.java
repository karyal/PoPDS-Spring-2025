package week4.day4;

public class Person {
	//instance variables of class
	private int pid;
	private String fullName;
	
	//Constructors
	public Person() { //default constructor
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
	//toString
	@Override
	public String toString() {
		return this.pid+", "+this.fullName;
	}
}













