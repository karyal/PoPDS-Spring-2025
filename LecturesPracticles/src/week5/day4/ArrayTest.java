package week5.day4;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//boolean, char, byte, short, int, long, float, double
		//Primitive type 	- store single value of specific type
		//Array type		- store multiple values of same type
		//Class type		- store multiple values of different types

		//Declare, initialize, assign, update, and access
		/*
		Integer nums[]; //declare
		nums = new Integer[5]; //initialize
		nums[0]=8; //value assign
		nums[1]=6;
		nums[2]=4;
		nums[3]=9;
		nums[4]=5;
		//nums[5]=6;//ArrayIndexOutofBoundsExceptions
		System.out.println(nums[0]+", "+nums[1]+", "+nums[2]+", "+nums[3]+", "+nums[4]); //accessing
		nums[3]=2;//update
		System.out.println(nums[0]+", "+nums[1]+", "+nums[2]+", "+nums[3]+", "+nums[4]); //accessing
		*/
		
		//Declare, initialize
		//int nums[]= {8, 6, 4, 9, 5}; //declare and initialize
		//System.out.println(nums[0]+", "+nums[1]+", "+nums[2]+", "+nums[3]+", "+nums[4]); //accessing
		//nums[3]=2;
		//System.out.println(nums[0]+", "+nums[1]+", "+nums[2]+", "+nums[3]+", "+nums[4]); //accessing
		
		//Integer ages[]=new Integer[40]; //for 40 persons //input in-future
		//Integer ages[]= {19, 18, 21, 20, 18, 17, 19, 19, 21, 22};//only for 10 persons
		//String names[]= {"Ujwal", "Sujit", "X Kumar", "Upal", "Aayush", "Suman", "Shradha", "Urmila", "Yash","Saru","Pranish"};
		//String names2[]=new String[39];
		//names2[0]="Ujwal";
		//names2[38]="Pranish";
		
		Integer nums[]=new Integer[Global.MAX];
		
		//input
		for(int i=0; i<Global.MAX; i++) {
			System.out.print("Enter any number : ");
			String tmpString = new Scanner(System.in).nextLine();
			Integer tmpNum = Integer.parseInt(tmpString);
			nums[i]=tmpNum;
		}
		
		//output
		for(int i=0; i<Global.MAX; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}










