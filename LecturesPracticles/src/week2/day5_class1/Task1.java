//WAP which accept two numbers from user, calculate sum, and display.

package week2.day5_class1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//declare
		   String strFirst;
		   String strSecond;
		   int firstNum;
		   int secondNum;
		   int sum;
		   
		   //input
		   System.out.println("Enter first number");
		   strFirst = new Scanner(System.in).nextLine();
		   System.out.println("Enter Second number");
		   strSecond = new Scanner(System.in).nextLine();
		   
		   //process
		   firstNum= Integer.parseInt(strFirst);    
		   secondNum= Integer.parseInt(strSecond);
		   
		   sum= firstNum+secondNum;
		   
		   //output
		   System.out.println("Sum of two number :"+ sum);
		       
		   
	}
}
