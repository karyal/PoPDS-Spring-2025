package week2.day4;

//import library
import java.util.Scanner;

public class BasicIOV3 {

	public static void main(String[] args) {
		//read string from keyboard
		System.out.println("Enter any number : ");//prompt for user
		String str1 = new Scanner(System.in).nextLine();
		//convert string to int
		int pop = Integer.parseInt(str1);
		System.out.println(pop);
	}
}
