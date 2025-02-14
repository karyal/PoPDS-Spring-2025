package week5.day5;
import java.util.Scanner;
public class BasicIO implements InfBasicIO{
	@Override
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	@Override
	public Integer readInteger() {
		return Integer.parseInt(new Scanner(System.in).nextLine());
	}
}