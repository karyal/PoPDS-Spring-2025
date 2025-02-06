package week4.day4;

public class NewPerson extends Person {
	private String email;
	public NewPerson() {
		this.email="";
	}
	public NewPerson(String email) {
		this.email=email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return this.email;
	}
	@Override
	public String toString() {
		return super.toString()+", "+this.email; //super->Person
	}
}
