package week5.day2;

public class Class4 {

	public static void main(String[] args) {
		int num2;
		num2=7;
		System.out.println(num2);
		f1();//step-into -> move to method
		f2();
		f1();
	}
	
	public static void f1() {
		int num2;
		num2=6;
		System.out.println(num2);
	}
	public static void f2() {
		int num2;
		num2=3;
		System.out.println(num2);
	}
}