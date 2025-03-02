package week7.day4;

import java.util.List;

//persons(pid:int, full_name varchar(50), email varcahr(50))
public class Test {

	public static void main(String[] args) {
		//new PersonCRUDV2().connect();
		//new PersonCRUDV2().insert();
		//new PersonCRUDV2().all();
		//new PersonCRUDV2().searchPID();//?
		//new PersonCRUDV2().update();//?
		//new PersonCRUDV2().delete();//?
		
//PersonCRUDV3 Test
		//Connect with database
		//new PersonCRUDV3().connect();
		
		//Insert Record
		int pid=9;
		String fullName="Sudan Rai";
		String email="sudan@gmail.com";
		//new PersonCRUDV3().insert(pid, fullName, email);
		
		//Update Record
		pid=9;
		fullName="Sudan Kr Rai";
		email="sudan.rai@gmail.com";
		//new PersonCRUDV3().update(pid, fullName, email);
		
		//Delete Record
		pid=9;
		//new PersonCRUDV3().delete(pid);
		
		//Select All
		/*
		List<Person> persons = new PersonCRUDV3().all(); //get all persons
		for(Person person: persons) {
			System.out.println(person); //print person individually
		}
		*/
		
		//Search based on PID
		pid=20;
		Person person = new PersonCRUDV3().searchPID(pid);
		if(person.getPID()==0) {
			System.out.println("Record not found!");
		}
		else {
			System.out.println(person);
		}
		
	}
}











