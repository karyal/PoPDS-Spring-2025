package week7.day3;

public class Person {
	private int pid;
	private String fullName;
	private String email;
	//Constructors, Setters, Getters, & toString
	public Person() {
		this.pid=0;
		this.fullName="";
		this.email="";
	}
	public Person(int pid, String fullName, String email) {
		this.pid=pid;
		this.fullName=fullName;
		this.email=email;
	}
	public void setPID(int pid) {
		this.pid=pid;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public int getPID() {
		return this.pid;
	}
	public String getFullName() {
		return this.fullName;
	}
	public String getEmail() {
		return this.email;
	}
	@Override
	public String toString() {
		return this.pid+", "+this.fullName+", "+this.email;
	}
}
