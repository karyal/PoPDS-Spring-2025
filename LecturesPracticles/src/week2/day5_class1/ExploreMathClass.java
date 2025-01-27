//Explore the Math Class of Java (System defined class)
package week2.day5_class1;

import java.lang.Math;
import java.util.Scanner;

public class ExploreMathClass {

	public static void main(String[] args) {
		//max(a:int, b:int):int
		/*
		//declare
		int n1, n2, n3;
		//input
		n1=56;
		n2=78;
		//process
		n3 = Math.max(n1, n2);
		//output
		System.out.println(n3);
		*/
		
		//min(a:int, b:int):int
		//Returns the smaller of two int values.
		//Example
		
		//abs(a:int):int
		//Returns the absolute value of an int value.
		//Example
		
		/*
		int n4, n5, n6, n7;
		n4=56;
		n5=90;
		n6=n4-n5;
		n7 = Math.abs(n6);
		System.out.println(n6); //-34
		System.out.println(n7); //34
		*/
		
		//Find the largest (max) value among three integer values.
		/*
		//declare
		int n1, n2, n3, maxNumber;
		
		//input
		n1=8;
		n2=7;
		n3=6;
		
		//process
		//max(a:int, b:int):int
		maxNumber = Math.max(n1, n2);
		maxNumber = Math.max(maxNumber, n3);
		
		//output
		System.out.println("MAX : "+maxNumber);
		*/
		
		//floor(a:double):double
		double num1=34.67;
		double result = Math.floor(num1);
		System.out.println(result); //34
		
		//ceil(a:double):double
		result = Math.ceil(num1);
		System.out.println(result); //35
		
		//pow(a:double, b:double):double
		//sqrt(a:double):double
		//Example
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
