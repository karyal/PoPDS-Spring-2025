package week2;

public class Test {
	public static void main(String []args) {
		//System Defined Types
		byte x; //declare
		x=9; //assign
		System.out.println(x); //access
		x=7;
		System.out.println(x); //access
		
		//User Defined Types
		Student s1; //declare
		s1 = new Student(); //initialize - memory allocation
		s1.rollNo=2;
		s1.fullName="Roshan";
		System.out.println(s1.rollNo);
		System.out.println(s1.fullName);
		
		//
		
	}
}
