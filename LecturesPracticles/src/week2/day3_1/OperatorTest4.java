package week2.day3_1;

public class OperatorTest4 {

	public static void main(String[] args) {
		//Conditional Operator ( )?:
		//Condition, Result1, Result2
		//Condition (==, !=, >, >=, <, <=) -> true/false
		//if result is true -> Resutl1
		//if result is false -> Result2
		int pop = 59; //Read from Keyboard?
		int PM = 50;
		boolean res=false;
		String result="NA";
		res=(pop>=PM);
		result=(res==true)?"PASS":"FAIL";
		System.out.println(result);
	}
}







