package week2.day3_1;
import java.util.Scanner; //1 import library

public class BasicIOV2 {

	public static void main(String[] args) {
		//I Input from Keyboard
		//Scanner (Class) -> nextLine() (Method) -> Read the String from Keyboard
		
		//2. Read String from keyboard
		System.out.print("Enter marks of pop: "); //prompt for user
		String tmp=new Scanner(System.in).nextLine();
		//String -> Convert to int
		//Convert String to int
		int pop = Integer.parseInt(tmp); //Integer -> Class : parseInt() -> Method
		//Convert String to int
		pop++;//increase by 1
		
		//O Display on Screen
		//System.out.print() //Method \n - line break, \t tab
		//System.out.println()//Method
		System.out.println(pop);
	}
}
