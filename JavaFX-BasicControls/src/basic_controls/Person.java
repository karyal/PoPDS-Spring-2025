package basic_controls;

public class Person {
	private int pid;
	private String fullName;
	private String email;
	
	//Default constructor
	public Person() {
		this.pid = 0;
		this.fullName = "";
		this.email = "";
	}
	//Parameterized Constructor
	public Person(int pid, String fullName, String email) {
		this.pid = pid;
		this.fullName = fullName;
		this.email = email;
	}
	//Copy Constructor
	public Person(Person person) {
		this.pid = person.pid;
		this.fullName = person.fullName;
		this.email = person.email;
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
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", fullName=" + fullName + ", email=" + email + "]";
	}
}
