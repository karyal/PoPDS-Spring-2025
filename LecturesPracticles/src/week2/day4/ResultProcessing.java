package week2.day4;

public class ResultProcessing {

	public static void main(String[] args) {
		//calculate the result
		int pop=56;
		int PM=50;
		boolean result = (pop>=PM);
		String strResult = (result==true)?"PASS":"FAIL";
		System.out.println("Result : "+strResult);
	}

}
