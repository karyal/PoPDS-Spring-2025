package week4.day4;

public class MethodTest2 {
	
	//no parameter and no return type
	public void hello() {
		System.out.println("Hello from PCPS");
	}
	//no parameter, and no return type
	public static void hello2() {
		System.out.println("Hello from Hello2()");
	}
	
	public static void main(String []args) {
		//Cannot make a static reference to the non-static method hello() from the type MethodTest2
		new MethodTest2().hello(); //call non static method
		MethodTest2.hello2();//call static method
		
	}
}
