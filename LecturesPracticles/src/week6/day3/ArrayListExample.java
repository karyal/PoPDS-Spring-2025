package week6.day3;

import java.util.ArrayList;
import java.util.List;

//ArrayList with User Defined Class
public class ArrayListExample {

	public static void main(String[] args) {
		// Declare and initialize
		List<Person> persons = new ArrayList<Person>();

		// Assign Value
		Person person1 = new Person(1, "Rajesh");
		Person person2 = new Person(2, "Kiran");
		Person person3 = new Person(3, "Rose");
		Person person4 = new Person(4, "Kiran");

		Person person5 = new Person(5, "Rajesh");
		Person person6 = new Person(6, "Ram");
		Person person7 = new Person(7, "Shyam");
		Person person8 = new Person(8, "Hari");
		Person person9 = new Person(9, "Chandru");

		Person person10 = new Person(10, "Rajesh");
		Person person11 = new Person(11, "Ujwal");
		Person person12 = new Person(12, "Xkumar");
		Person person13 = new Person(13, "Unish");

		Person person14 = new Person(14, "Pattey");
		Person person15 = new Person(15, "Dharey");
		Person person16 = new Person(16, "Chiran");
		Person person17 = new Person(17, "Milan");

		//Insert Record - Create
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);
		persons.add(person7);
		persons.add(person8);
		persons.add(person9);
		persons.add(person10);
		persons.add(person11);
		persons.add(person12);
		persons.add(person13);
		persons.add(person14);
		persons.add(person15);
		persons.add(person16);
		persons.add(person17);
		
		//count - Aggregate function (sum, avg, count, min, max)
		System.out.println(persons.size());
		
		//Print all persons - Retrieve all records/Select All
		//Example-1
		System.out.println(persons);
		
		//Example-2
		for(int i=0; i<persons.size(); i++) {
			System.out.print(persons.get(i)+";");
		}
		System.out.println();
		
		//Example-3
		for(Person p: persons) {
			System.out.print(p+"; ");
		}
		System.out.println();
		
		//Example-4 HW
		//Example-5 HW
		
		//Select record based on id, or name - Search
		int tmpID = 4;
		//select * from persons where pid=4;
		//persons (17 records)
		boolean result=false;
		Person tmpPerson=null;
		for(Person p: persons) {
			if(p.getPID()==tmpID) {
				result=true;
				tmpPerson=p;
				break;
			}
		}
		if(result==true) {
			System.out.println("Person found");
			System.out.println(tmpPerson);
		}
		else {
			System.out.println("Person not found");
		}
		
		//Update | Edit
		tmpPerson = persons.get(7);//index
		System.out.println("Old : "+tmpPerson);
		tmpPerson.setFullName("Nima Sharma");
		persons.set(7, tmpPerson);
		System.out.println("New : "+tmpPerson);
		
		//Delete | Remove
		//Get, Delete
		tmpPerson = persons.get(10);
		System.out.println(tmpPerson);
		persons.remove(10);//delete
		
	}
}












