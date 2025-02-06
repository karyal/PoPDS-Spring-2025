package week4.day4_2;

public class MyCalculatorTest {

	public static void main(String[] args) {
		Numbers nums=new Numbers(6,7);
		MyCalculator c1 = new MyCalculator();
		nums = c1.sum(nums);
		System.out.println(nums);
	}
}