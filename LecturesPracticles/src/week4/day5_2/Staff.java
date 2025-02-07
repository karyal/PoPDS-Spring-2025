package week4.day5_2;

public class Staff {
	private String department;
	private String designation;
	
	//Constructors
	public Staff() {
		this.department="";
		this.designation="";
	}
	public Staff(String department, String designation) {
		this.department=department;
		this.designation=designation;
	}
	
	//Setters
	public void setDepartment(String department) {
		this.department=department;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	//Getters
	public String getDepartment() {
		return this.department;
	}
	public String getDesignation() {
		return this.designation;
	}
	//toString
	@Override
	public String toString() {
		return this.department+", "+this.designation;
	}
}
