package week3.day3.library;

//Class
public class Person {
	//instance variable(s)
	private int personID;
	private String fullName;
	private String address;
	private String mobileNumber;
	private String email;
	
	//Constructor(s)
	public Person() {
		this.personID=-1;
		this.fullName="NA";
		this.address="NA";
		this.mobileNumber="NA";
		this.email="NA";
	}
	
	//Setters
	public void setPersonID(int personID) {
		this.personID=personID;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber=mobileNumber;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	//Getters
	public int getPersonID() {
		return this.personID;
	}
	
	public String getFullName() {
		return this.fullName;
	}
	public String getAddress() {
		return this.address;
	}
	public String getMobileNumber() {
		return this.getMobileNumber();
	}
	public String getEmail() {
		return this.email;
	}
	//toString()
	public String toString() {
		return this.personID+", "+this.fullName+", "+this.address+", "+this.mobileNumber+", "+this.email;
	}
}







