package week3.day3;

public class Student {
	
	private String rollNo;
	private String fullName;
	private String course;
	private String level;
	private String section;
	private double dcnDB;
	private double dcnCN;
	private double pop;
	
	//Method name same with class name -> Constructor (set default value on object)
	//Constructor method with no parameter is called default constructor
	public Student() {
		this.rollNo="NA";//default value
		this.fullName="NA";//default value
	}
	
	public void setRollNo(String rollNo) {
		this.rollNo=rollNo;
	}
	
	public String getRollNo() {
		return this.rollNo;
	}
	
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	
	public String getFullName() {
		return this.fullName;
	}
	
	//return all values
	public String toString() {
		return this.rollNo+", "+this.fullName;
	}
}










