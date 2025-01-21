package week2.day2_Lab;

public class DataTypes {
	public static void main(String[] args) {
		//Primitive types
		//byte, short, int, long - whole number
		//float, double - real number
		//boolean - true/false
		//char - single quote character
		
		//Reference type
		//String - double quote character(s)
		//Object - all types
		
		//boolean - true/false
		boolean result = false; //declare and assign
		System.out.println(result);//false
		result=true; //update value
		System.out.println(result); //true
		
		//char - ''
		char ch='A'; //declare and assign
		System.out.println(ch); //access A
		//update
		ch='/';
		System.out.println(ch); //access
		
		//String - ""
		String str1="PCPS College\nName:\t\tKrishna\nCourse:\t\tBScSE\nLevel:\t\tL4\nSection:\tC";
		System.out.println(str1); //access A
		
		//Object
		Object obj1;
		obj1=1.02;
		System.out.println(obj1);
	}
}
