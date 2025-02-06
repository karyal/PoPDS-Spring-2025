package week4.day3;

public class Person {
	//instance variables
	private int pid;
	private String fullName;
	
	//Constructor
	public Person() { //Default Constructor
		this.pid=0;
		this.fullName="";
	}
	
	public Person(int pid, String fullName) { //Parameterized Constructor
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
	
	public String toString() {
		return this.pid+", "+this.fullName;
	}
}








