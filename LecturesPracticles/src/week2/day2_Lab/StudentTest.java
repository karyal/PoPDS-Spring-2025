package week2.day2_Lab;

public class StudentTest {
	public static void main(String[] args) {
		Student s1; //declare
		s1=new Student(); //initialize
		s1.rollNo=1;
		s1.fullName="Raj Thapa";
		s1.course="BScSE";
		s1.level="L4";
		s1.section='C';
		
		//display all the data of s1
		System.out.println(s1.rollNo+","+s1.fullName+",");
		
	}
}
