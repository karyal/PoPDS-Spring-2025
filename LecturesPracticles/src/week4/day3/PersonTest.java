package week4.day3;

public class PersonTest {

	public static void main(String[] args) {
		Person person1;//declare
		person1=new Person(); //initialize
		
		//Setting Values
		person1.setPID(5);
		person1.setFullName("Rajan");
		
		//Getting value individually
		System.out.println(person1.getPID());
		System.out.println(person1.getFullName());

		//Get all values
		System.out.println(person1.toString());
		System.out.println(person1);
	}

}
