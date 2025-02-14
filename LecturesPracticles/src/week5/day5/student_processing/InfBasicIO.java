package week5.day5.student_processing;

public interface InfBasicIO {
	//Output Methods
	public void printMessage(String message);//Prompt for user
	public void printMessage(String label, String message);//Display Strings
	public void printMessage(String label, double num1);//Display String and double
	
	//Input Methods
	public Integer readInteger();//Read Integer from keyboard
	public Double readDouble(); //Read Double from keyboard
	public String readString(); //Read String from keyboard
}