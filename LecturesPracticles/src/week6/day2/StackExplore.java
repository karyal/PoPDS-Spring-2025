package week6.day2;

//java.lang.* -- no need to import
import java.util.Stack;

public class StackExplore {

	public static void main(String[] args) {
		//Vector 
		//- Collection (Like Array), any types, any numbers
		
		//Stack - First-In/Last-Out | Last-In/First-Out
		
		//java.util - Package
		//public class Stack<E> extends Vector<E> - Class Signature

		//Constructor - initialization of object
		//Stack() --default constructor
		
		Stack s1 = new Stack();
		
		//Methods
		//boolean empty() 
		/*
		boolean res = s1.empty();
		if(res==true) {
			System.out.println("s1 is empty");
		}
		else {
			System.out.println("s1 is not empty");
		}
		*/
		
		Object element;
		//E push(E item)
		element = 5;
		s1.push(element);
		
		//E peek()
		element = s1.peek(); //Get Value
		System.out.println(element);//EmptyStackException
		
		//E pop()
		element = s1.pop();
		System.out.println(element);
		
		//is empty
		boolean res = s1.empty();
		if(res==true) {
			System.out.println("s1 is empty");
		}
		else {
			System.out.println("s1 is not empty");
		}
		
		//int search(Object o)
		int index = s1.search(3);
		System.out.println(index);
	}

}









