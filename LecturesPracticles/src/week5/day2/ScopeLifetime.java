package week5.day2;

public class ScopeLifetime {

	//Life-time - Store in memory (duration)
	//Scope - Visibility
	
	static int MAX=9; //Global variable
	
	public static void main(String[] args) {
		int num1;//Local variable main block
		num1=7;
		System.out.println(num1);
		System.out.println(MAX); //Global
	}
	
	public static void f1() {
		int num1=8;//Local variable of f1 block
		System.out.println(num1);//scope
		System.out.println(MAX); //Global
		
	}

}
