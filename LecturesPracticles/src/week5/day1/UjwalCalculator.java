package week5.day1;

public class UjwalCalculator extends Calculator{
	@Override
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	@Override
	public int prd(int num1, int num2) {
		return num1*num2;
	}

	public int div(int num1, int num2) {
		return num1/num2;
	}
}