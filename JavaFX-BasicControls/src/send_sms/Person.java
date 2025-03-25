package send_sms;

public class Person {
	private boolean select;
	private int pid;
	private String fullName;
	private String email;
	private String mobile;
	private String vehicleNumber;
	
	//Default constructor
	public Person() {
		this.select=false;
		this.pid = 0;
		this.fullName = "";
		this.email = "";
		this.mobile="";
		this.vehicleNumber="";
	}
	//Parameterized Constructor
	public Person(boolean select, int pid, String fullName, String email, String mobile, String vehicleNumber) {
		this.select=select;
		this.pid = pid;
		this.fullName = fullName;
		this.email = email;
		this.mobile=mobile;
		this.vehicleNumber=vehicleNumber;
	}
	//Copy Constructor
	public Person(Person person) {
		this.select=person.select;
		this.pid = person.pid;
		this.fullName = person.fullName;
		this.email = person.email;
		this.mobile= person.mobile;
		this.vehicleNumber = vehicleNumber;
	}
	public boolean getSelect() {
		return select;
	}
	public void setSelect(boolean select) {
		this.select = select;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	@Override
	public String toString() {
		return "Person [select=" + select + ", pid=" + pid + ", fullName=" + fullName + ", email=" + email + ", mobile="
				+ mobile + ", vehicleNumber=" + vehicleNumber + "]";
	}
}