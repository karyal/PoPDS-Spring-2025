package week5.day1;

public class Class2 extends Class1{
	private int num2; //instance variable
	public Class2() { //constructor
		this.num2=0;
	}
	public Class2(int num2) { //constructor
		this.num2=num2;
	}
	//constructors - Method overloading
	public void setNum2(int num2) {
		this.num2=num2;
	}
	
	@Override
	public void setNum1(int num1) {
		super.setNum1(num1);
	}
	public int getNum2() {
		return this.num2;
	}
	public String toString() {
		return this.num2+" ";
	}
}
