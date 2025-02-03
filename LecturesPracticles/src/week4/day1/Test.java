package week4.day1;

import pkg1.MyClass;

public class Test {

	public static void main(String[] args) {
		
		//call method from jar file?
		MyClass myClass=new MyClass();
		myClass.hello();
		
		int x=myClass.sub(56, 3);
		System.out.println("Result : "+x);
	}

}
