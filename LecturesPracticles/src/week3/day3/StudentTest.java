package week3.day3;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		//.....
		Student s40=new Student();
		
		s1.rollNo="1232345";
		s1.fullName="Krishna Aryal";
		
		s40.rollNo="4554455";
		s40.fullName="Umesh Yadav";
		
		System.out.println(s1.rollNo+", "+s1.fullName);
		System.out.println(s1.rollNo+", "+s1.fullName);
		
		Student s2 = new Student();//call default constructor
		Student s3 = new Student();//call default constructor
		System.out.println(s2.rollNo);//NA
		System.out.println(s3.rollNo);//NA
		System.out.println(s2.fullName);//NA
		System.out.println(s3.fullName);//NA
		
		Student s4 = new Student();//declare, initialize, and set default values
		s4.setRollNo("987654321");//individual value set
		s4.setFullName("Ranjit Sharma");//individual value set
		System.out.println(s4.getRollNo()+", "+s4.getFullName());//individual value get
		System.out.println(s4); //get all values
		
		
		
		
		
		
		
		
		
	}

}
