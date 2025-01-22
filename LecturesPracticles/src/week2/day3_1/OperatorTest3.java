package week2.day3_1;

public class OperatorTest3 {

	public static void main(String[] args) {
		//Data Types - boolean (true/false)
		boolean res=false;//default value
		System.out.println(res);//false
		res=true;
		System.out.println(res);//true
		
		//char - single quote char ''
		char ch='\0';//default value
		System.out.println(ch);
		ch='A';
		System.out.println(ch);
		ch='/';
		System.out.println(ch);
		
		//4. Relational Operator
		//Compare two values and return boolean result
		int num1, num2; //auto initialize
		boolean res2=false; //manually initialize
		num1=48;
		num2=50;
		
		//> GT
		res2=(num1>num2);//is num1 is gt num2
		System.out.println(res2);//false
		res2=(num2>num1);//is num2 is gt num1
		System.out.println(res2);//true
		
		// < LT
		num1=56;
		num2=45;
		res2=(num1<num2);//is num1 is lt num2 -> false
		System.out.println(res2);//false
		res2=(num2<num1);//is num1 is lt num2 -> true
		System.out.println(res2);//true
		
		// == EQ
		num1=34;
		num2=23;
		res2=(num1==num2); //num1 is eq num2 -> false
		System.out.println(res2); //false
		num1=45;
		num2=45;
		res2=(num1==num2); //num1 is eq num2 -> ture
		System.out.println(res2);
		
		
		// != Not EQ
		num1=90;
		num2=90;
		res=(num1!=num2); //num1 is not eq num2 -> false
		System.out.println(res2);
		
		num1=9;
		num2=3;
		res=(num1!=num2); //num1 is not eq num2 -> true
		System.out.println(res2);
		
		res2 = (num1==num2);
		System.out.println(res2);
		
		//>= GT or EQ | <= LT or EQ
		//num1 is gt num2 or num1 is eq num2
		res2 = (5>=5);
		System.out.println(res2);
		res2 = (5>=3);
		System.out.println(res2);
		res2 = (3>=5);
		System.out.println(res2);
		res2 = (5<=7);
		System.out.println(res2);
		
		//<= LT or EQ
		res2 = (5<=5);
		System.out.println(res2);
		res2 = (5<=3);
		System.out.println(res2);
		res2 = (3<=5);
		System.out.println(res2);
		res2 = (5<=7);
		System.out.println(res2);
		
		//Description of code (line/block/method/class)
		//Comment - single line -escape to compile
		
		//Multi-line comment
		/*
		line1
		line2
		line3
		*/
		
		int x; //Statement
		int y; //Statement
		int z; //Statement
		//Expression1 Expression2 Expression3 Expression4 -> Statement
		
		{
			//Statement1
			//Statement2
			//.......
			//StatmentN
		}
	}
}
