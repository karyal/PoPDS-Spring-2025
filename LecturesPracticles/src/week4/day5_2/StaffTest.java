package week4.day5_2;

public class StaffTest {

	public static void main(String[] args) {
		//declare, initialize, get
		//Person, and Staff class
		/*
		Person p1 = new Person(1, "Aayush Thapa");
		Staff s1 = new Staff("Finance", "Manager");
		p1.setPID(5); //update
		System.out.println(p1+", "+s1);
		*/
		
		/*
		NewStaff ns1 = new NewStaff("Admin", "Assistant");//NewStaff
		ns1.setPID(2); //Person
		ns1.setFullName("Kamal Shrestha");//Person
		System.out.println(ns1);//NewStaff
		*/
		
		NewStaff ns2 = new NewStaff(2, "Upal Sharma","Academic", "Student");
		ns2.setSID(1);
		System.out.println(ns2);
	}
}

















