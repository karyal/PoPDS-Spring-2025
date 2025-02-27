package week7.day3;

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
		new PersonCRUDV3().connect();
		
		//Insert Record
		int pid=9;
		String fullName="Sudan Rai";
		String email="sudan@gmail.com";
		
	}
}
