package week5.day1;

public class SakarCalculator extends Calculator {
	
	@Override
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
	@Override
	public int prd(int num1, int num2) {
		return num1*num2;
	}
	
	public int sub(int num1, int num2) {
		return ((num1>=num2)?num1-num2:num2-num1);
	}
}
