package week4.day1;

public class IfStatment {

	public static void main(String[] args) {
		//1. if statement
		/*
		int num1 = 1;
		if(num1==2)
			System.out.println("Zero");
		*/
		
		//Example2
		/*
		int num1 = 2;
		if(num1==1)
			System.out.println("SUN");
		if(num1==2)
			System.out.println("MON");
		if(num1==3)
			System.out.println("TUE");
		if(num1==4)
			System.out.println("WED");
		if(num1==5)
			System.out.println("THU");
		if(num1==6)
			System.out.println("FRI");
		if(num1==7)
			System.out.println("TUE");
		*/
		
		//Example-3
		/*
		int num1=2;
		if(num1==1)
			System.out.println("One");
		System.out.println("Hello from PCPS");
		System.out.println("Hi from L4 Section-C");
		*/
		
		//Example-4
		/*
		int num1=1;
		if(num1==1) {//create a block of code
			System.out.println("One");
			System.out.println("Hello from PCPS");
			System.out.println("Hi from L4 Section-C");
		}
		*/
		
		//Example-5
		/*
		int num1=4;
		if(num1!=4) {//Not Equals to
			System.out.println("Hello");
		}
		*/
		
		//if-else-then Statement
		//Example-6
		/*
		int age=18;
		if(age>18) {
			System.out.println("Can vote!");
		}
		else {
			System.out.println("Can't vote!");
		}
		*/
		
		//else-if Statement
		//Example-7
		/*
		int day=3;
		if(day==1) {
			System.out.println("SUN");
		}
		else if(day==2) {
			System.out.println("MON");
		}
		else if(day==3) {
			System.out.println("TUE");
		}
		else if(day==4) {
			System.out.println("WED");
		}
		else if(day==5) {
			System.out.println("THU");
		}
		else if(day==6) {
			System.out.println("FRI");
		}
		else if(day==7) {
			System.out.println("SAT");
		}
		else {
			System.out.println("Out of range");
		}
		*/
		
		//nested if statement
		//Example-8
		/*
		int pop, dcn, PM;
		pop=56;
		dcn=43;
		PM=40;
		String result="FAIL";
		if(pop>=PM) //outer if
			if(dcn>=PM) //inner if
				result="PASS";
		System.out.println(result);
		*/
		
		//if statement with multiple conditions
		//Example-9
		int pop, dcn, PM;
		boolean res;
		String result;
		pop=45;
		dcn=34;
		PM=40;
		res=false;
		result="FAIL";
		if((pop>=PM) && (dcn>=PM)) {
			result="PASS";
		}
		System.out.println(result);
		if(res==true) {
			System.out.println("TRUE");
		}
		if(!(res==true)) {
			System.out.println("FALSE");
		}
	}
}
