package week3.day3;

public class MyMath {
	
	//static method calculateSum which accept two numbers as parameter and return sum
	public static int calculateSum(int n1, int n2) {
		int n3 = n1+n2;
		return n3;
	}
	
	//method calcSum which calculate sum and return
	public int calcSum(int n1, int n2) {
		int n3 = n1+n2;
		return n3;
	}
	
	//method sum which calculate sum and display
	public void sum(int n1, int n2) {
		int n3=n1+n2;
		System.out.println("Sum : "+n3);
	}
	
	//method sum which calculate sum and display
	public void sum() {
		int n1, n2, n3; //declare variable
		n1=89; //assign value
		n2=76;//assign value
		n3=n1+n2; //calculate sum
		System.out.println("Sum : "+n3);//display result
	}
	
}
