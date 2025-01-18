package week1;

//import library
import java.util.Scanner;

public class BasicIO {
	public static void main(String []args) {
	//I-> Input from Keyboard
	//System Library -> Scanner //System defined class
	String fullName;
	System.out.println("Enter your name : "); //prompt for user
	fullName = new Scanner(System.in).nextLine();//Reading value from keyboard
	
	//O-> Output on Display
	//System.out.print() //System defined method
	System.out.println("Your name is : "+fullName);
	}
}
