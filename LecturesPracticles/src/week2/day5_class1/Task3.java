
//WAP which accept two numbers from user and display the largest.

package week2.day5_class1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//declare
		String tmpString1;
		String tmpString2;
		int firstNumber, secondNumber, largeNumber;
		//input
		System.out.print("Enter first number : ");
		tmpString1 = new Scanner(System.in).nextLine();
		System.out.print("Enter second number : ");
		tmpString2 = new Scanner(System.in).nextLine();
		
		//process
		firstNumber = Integer.parseInt(tmpString1);
		secondNumber = Integer.parseInt(tmpString2);
		
		//calculate largest
		//()?: //Conditional Operator
		largeNumber = (firstNumber>secondNumber)?firstNumber:secondNumber;
		
		//output
		System.out.print("Largest Number : "+largeNumber);
	}
}