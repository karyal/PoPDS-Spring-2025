package week4.day5_2;

public class NewStaff extends Person {
	private String department;
	private String designation;
	
	//Constructors
	public NewStaff() { //default constructor
		super(); //call default constructor of super class i.e. Person()
		this.department="";
		this.designation="";
	}
	public NewStaff(int sid, String fullName, String department, String designation) {
		super(sid, fullName);//call parameterized constructor of super class
		this.department=department;
		this.designation=designation;
	}
	
	//Setters
	public void setSID(int sid) {
		super.setPID(sid);
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	
	//Getters
	public int getSID() {
		return super.getPID();
	}
	public String getDepartment() {
		return this.department;
	}
	public String getDesignation() {
		return this.designation;
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+", "+this.department+", "+this.designation;
	}
}
