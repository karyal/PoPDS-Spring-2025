package week6.day2_2;

import java.util.ArrayList;

class Person {
	private Integer pid;
	private String fullName;
	//Constructors
	public Person() {
		this.pid=0;
		this.fullName="";
	}
	public Person(int pid, String fullName) {
		this.pid=pid;
		this.fullName=fullName;
	}
	//Setters
	public void setPID(int pid) {
		this.pid=pid;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	//Getters
	public int getPID() {
		return this.pid;
	}
	public String getFullName() {
		return this.fullName;
	}
	//toString
	@Override
	public String toString() {
		return this.pid+", "+this.fullName;
	}
}

public class ArrayListExample {

	public static void main(String[] args) {
		//ArrayList with primitive data types (boolean, byte, char, short, int, long, float, double)
		//Declare, initialize, add, get, set, remove, search (CRUD operations)
		
		//40 Persons in Class
		ArrayList persons = new ArrayList();
		Person p1 = new Person(1, "Raj Rai");
		persons.add(p1);
		System.out.println(persons);
		
		//CRUD Operations - Data Manipulation Language (DML)
		//Add Item -- Insert/Create
		//Set Item -- Update/Edit
		//Get Item  -- Select/Retrieve
		//Search Item -- Conditional Select
		//Remove Item -- Delete
	}

}












