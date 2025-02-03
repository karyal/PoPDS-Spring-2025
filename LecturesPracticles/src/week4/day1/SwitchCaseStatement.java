package week4.day1;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		//Alternative of else-if statement
		
		//Example-1
		int num1=0;
		switch(num1) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			default:
				System.out.println("Out of range");
		}
	}
}
