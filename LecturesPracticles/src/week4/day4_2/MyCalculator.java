package week4.day4_2;

public class MyCalculator {
	public Numbers sum(Numbers numbers) {
		int tmpNumber=numbers.getNum1()+numbers.getNum2();
		numbers.setNum3(tmpNumber);
		return numbers;
	}
	public Numbers diff(Numbers numbers) {
		int tmpNumber=numbers.getNum1()-numbers.getNum2();
		numbers.setNum3(tmpNumber);
		return numbers;
	}
	public Numbers prd(Numbers numbers) {
		int tmpNumber=numbers.getNum1()*numbers.getNum2();
		numbers.setNum3(tmpNumber);
		return numbers;
	}
	public Numbers div(Numbers numbers) {
		int tmpNumber=numbers.getNum1()/numbers.getNum2();
		numbers.setNum3(tmpNumber);
		return numbers;
	}
}