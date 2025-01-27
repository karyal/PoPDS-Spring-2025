package week3.day1;

import java.util.Scanner;

public class StringClassExplore {
	public static void main(String[] args) {
		//String Class
		
		//Constructors
		//String()
		String str1; //declare
		str1=new String(); //Initialize by Constructor
		//new -> memory allocation (free to use - store/update/retrieve)
		
		//String() -> special method - method name is similar with Class name
		
		//Constructor is used to set default value at the time  
		//of initialization of an object
		
		str1 ="PCPS College"; //Update Value
		System.out.println(str1);//PCPS College //Access Value
		str1 = "Lalitpur, Nepal";//Update Value
		System.out.println(str1);//Lalitpur, Nepal //Access Value
		
		//Example-2
		String str2 = new String(); //Declare, memory allocation, and initialize
		str2 = str1; //access the value of str1 and assign to str2
		System.out.println(str2);//accessing the value of str2
		
		//EXample-3
		//String(byte[] bytes)
		byte nums[]=new byte[5]; //0-255
		nums[0]=65;
		nums[1]=90;
		nums[2]=98;
		nums[3]=70;
		nums[4]=102;
		String str3 = new String(nums);
		System.out.println(str3);//AZbFf
		
		//Example-4
		int num1 = 1;
		int MAX=255;
		System.out.println("ASCII CODES");
		while(num1<=MAX) {
			System.out.println(num1+" - "+(char)num1); //number to character
			num1++;//increase by 1
		}
		
		//Example-5
		//String(String original)
		String str4 = new String();
		str4="Hello";
		String str5 = new String(str4);
		System.out.println(str5);
		
		//Methods
		//char charAt(int index)
		//Returns the char value at the specified index.
		
		//Example-6
		String str6 =new String("PCPS");
		char ch = str6.charAt(2);
		System.out.println(ch);
		
		//int compareTo(String anotherString)
		//Compares two strings lexicographically.
		
		//Example-7
		String str7 ="PCPs";
		String str8 ="PCPs";
		int res = str7.compareTo(str8);
		System.out.println(res);
		
		//Result
		//0-equals
		//>< 0 - Not equals
		
		//Example-8
		String str8_1=new String("admin");
		String str8_2=new String();
		int result=-1;
		String strResult="NA";
		System.out.println("Enter your user name : ");
		str8_2 = new Scanner(System.in).nextLine();
		result=str8_1.compareTo(str8_2);
		strResult=(result==0)?"Equals":"Not equals";
		System.out.println(strResult);
		
		
		//Explore all the methods of String class (Listed)
		
		
		
		
		
		
	}
}
