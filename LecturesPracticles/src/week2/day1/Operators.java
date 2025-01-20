package week2.day1;

public class Operators {
	public static void main(String[] args) {
		//Data Types
		//System defined, User Defined, and Array
		
		//Operators
		//Assignment Operator
		//simple assignment operator
		byte x=30; 
		System.out.println(x);//30
		
		//multiple assignment operator
		byte a,b,c;
		a=b=c=9; 
		System.out.println(a); //9
		
		//short-hand assignment operator
		int y=6;
		y=y+3;
		System.out.println(y); //9
		
		y+=3; //y=y+3; //-, *, /, %
		System.out.println(y); //12
		
		//Arithmetic Operators (Numeric type)
		//+, -, *, /, %, pow, sqrt
		
		int num1, num2, num3;
		num1=7;
		num2=3;
		num3=num1+num2;
		System.out.println(num3); //10
		
		num3=num1-num2;
		System.out.println(num3); //4
		num3=num2-num1;
		System.out.println(num3); //-4
		
		num3=num1*num2;
		System.out.println(num3); //21
		
		num3=num1/num2;
		System.out.println(num3); //2
		
		num3=num1%num2;
		System.out.println(num3); //1
		
		//Power
		System.out.println(Math.pow(4, 2));//base, exp
		
		//Square
		System.out.println(Math.sqrt(16)); //4
		
		//Concat +
		String str1="Raj";
		String str2="Rai";
		System.out.println(str1+" "+str2);
		System.out.println("PCPS"+2);
		System.out.println(1+"PCPS");
		System.out.println(2+2);
		
		//Increment and Decrement Operator
		//++ increment operator - increase by 1 (whole number)
		
		int num4 = 1;
		System.out.println(num4); //1
		num4+=1; //increase by 1
		System.out.println(num4); //2
		num4=num4+1; //increase by 1
		System.out.println(num4); //3
		num4++; //increase by 1 //post-increment operator
		System.out.println(num4);//4
		++num4; //increase by 1 //pre-increment operator
		System.out.println(num4);//5
		
		//-- decrement operator - decrease by 1 (whole number)
		
		int num5 = 1;
		System.out.println(num5); //1
		num4-=1; //increase by 1
		System.out.println(num5); //2
		num5=num5-1; //increase by 1
		System.out.println(num5); //3
		num5--; //increase by 1 //post-increment operator
		System.out.println(num5);//4
		--num5; //increase by 1 //pre-increment operator
		System.out.println(num5);//5
				
	}
}
