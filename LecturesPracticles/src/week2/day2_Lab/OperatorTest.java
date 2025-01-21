package week2.day2_Lab;

public class OperatorTest {
	public static void main(String[] args) {
		//1. Assignment Operator
		//simple assignment operator
		int num1=2;
		int num2=num1;
		System.out.println(num2);
		
		//multiple assignment operator
		num1=num2=5;
		System.out.println(num1);
		System.out.println(num2);
		
		//short-hand assignment operator
		num1=10;
		System.out.println(num1);//10
		num1+=2; //num1=num1+2;
		System.out.println(num1);//
		
		//2. Arithmetic operator
		int num3=10;
		int num4=3;
		
		int num5=num3+num4;//add, assignment, line termination
		System.out.println(num5); //
		
		num5=num3-num4;//sub
		System.out.println(num5); //
		
		num5=num3*num4;//prd
		System.out.println(num5); //
		
		num5=num3/num4;//div
		System.out.println(num5); //
		
		num5=num3%num4;//mod
		System.out.println(num5); //
		
		//Power
		double num6 = Math.pow(5, 3);
		System.out.println(num6);
		
		//SQRT
		num6 = Math.sqrt(81);
		System.out.println(num6);
		
	}
}
