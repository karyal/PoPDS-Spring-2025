package week5.day1;

public class Class1 { //Class Start
	private int num1; //instance variable
	public Class1() { //constructor
		this.num1=0;
	}
	public Class1(int num1) { //constructor
		this.num1=num1;
	}
	//constructors - Method overloading
	public void setNum1(int num1) {
		this.num1=num1;
	}
	public int getNum1() {
		return this.num1;
	}
	public String toString() {
		return this.num1+" ";
	}
}//Class End
