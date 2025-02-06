package week4.day3;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private int thirdNumber;

	// default constructor
	public Calculator() {
		this.firstNumber = 0;
		this.secondNumber = 0;
		this.thirdNumber = 0;
	}

	// parameterized constructor
	public Calculator(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = 0;
	}

	// parameterized constructor
	public Calculator(int firstNumber, int secondNumber, int thirdNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}

	// setters
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;

	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void setThirdNumber(int thirdNumber) {
		this.thirdNumber = thirdNumber;
	}

	// getters
	public int getFirstNumber() {
		return this.firstNumber;
	}

	public int getSecondNumber() {
		return this.secondNumber;
	}

	public int getThirdNumber() {
		return this.thirdNumber;
	}

	// toString
	public String toString() {
		return this.firstNumber + ", " + this.secondNumber + ", " + this.thirdNumber;
	}
}