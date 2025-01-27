package week2.day4;

//import library
import java.util.Scanner;

public class IOProcessing {

	public static void main(String[] args) {
		//read string from keyboard
		//string to int
		//processing result
		//display result
		
		//declare
		String tmpString;
		int pop;
		int PM;
		String strResutl;
		boolean result;
		
		//input
		System.out.println("Enter mark of pop : ");
		tmpString = new Scanner(System.in).nextLine();
		
		//process
		PM = 50;
		pop = Integer.parseInt(tmpString); //string to integer
		result = (pop>=PM);
		strResutl = (result==true)?"PASS":"FAIL";
		
		//output
		System.out.println("Result : "+strResutl);
	}
}
