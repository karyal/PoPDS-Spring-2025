package week2.day4;

public class OperatorsTest {

	public static void main(String[] args) {
		//Assignment operators
		//Arithmetic operators
		//Relational operator
		//Conditional operator
		//Data types (primitive, extended, and user defined)
		
		//Condition -> true/false
	
		//Relational operator
		//compare two values and return boolean result
		
		//Logical operator
		//Compare two conditions and result boolean result
		
		//&& - AND
		//T-T-T
		//T-F-F
		//F-T-F
		//F-F-F
		boolean result = false;
		result = ((2==2) && (2>1));
		System.out.println(result);//true
		result = ((3==3) && (3>6));
		System.out.println(result);//false
		result = ((3!=3) && (3>2));
		System.out.println(result);//false
		result = ((5>=6) && (3==2));
		System.out.println(result);//false
		
		//|| OR
		//T-T-T
		//T-F-T
		//F-T-T
		//F-F-F
		boolean result2 = false;
		result2 = ((1==1) || (3==3));
		System.out.println(result2);
		result2 = ((5>=1) || (6==3));
		System.out.println(result2);
		result2 = ((1!=1) || (3==3));
		System.out.println(result2);
		result2 = ((10==34) || (3==30));
		System.out.println(result2);
		
		//! Not
		//T - F
		//F - T
		boolean result3 = false;
		result3 = (7>6);
		System.out.println(result3);
		result3 = ! result3;
		System.out.println(result3);
		
		result3 = (7==6);
		System.out.println(result3);
		result3 = ! result3;
		System.out.println(result3);
		
		
		
		
		
		
		

	}
}