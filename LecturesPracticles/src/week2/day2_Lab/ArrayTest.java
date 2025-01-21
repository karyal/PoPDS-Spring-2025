package week2.day2_Lab;

public class ArrayTest {
	public static void main(String[] args) {
		//VVIP
		int ages[]; //declare
		ages=new int[5]; //initialize
		//ages[0]-ages[4] i.e. 5 ages
		
		//assign different values
		ages[0]=19;
		ages[1]=18;
		
		//access all values
		System.out.println(ages[0]+", "+ages[1]);
		//update value
		ages[0]=18;
		//access updated value
		System.out.println(ages[0]);
		
	}
}
