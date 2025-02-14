package week5.day4;
import java.util.Scanner;

public class BasicIO implements InfBasicIO {
// Output Methods
	// Prompt for user
	public void printMessage(String message) {
		System.out.print(message);
	}
	// Display Strings
	public void printMessage(String label, String message) {
		System.out.println(label+" : "+message);
	}
	// Display String and double
	public void printMessage(String label, double num1) {
		System.out.println(label+" : "+num1);
	}
	
// Input Methods
	// Read Integer from keyboard
	public Integer readInteger() {
		Integer tmpInt = Integer.parseInt(readString());
		return tmpInt;
	};
	
	// Read Double from keyboard
	public Double readDouble() {
		Double tmpDouble = Double.parseDouble(readString());
		return tmpDouble;
	}
	
	// Read String from keyboard
	public String readString() {
		String tmpString = new Scanner(System.in).nextLine(); //Read String //System.in->Keyboard
		return tmpString;
	}
}



