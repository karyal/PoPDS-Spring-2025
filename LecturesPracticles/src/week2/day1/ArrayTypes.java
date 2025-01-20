package week2.day1;

public class ArrayTypes {
	public static void main(String []args) {
		//declare
		byte ages[];
		
		//initialize - memory allocation
		ages= new byte[3]; //0-2
		
		//assign
		ages[0]=20;
		ages[1]=19;
		ages[2]=18;
		
		//update//change//replace
		ages[2]=19;
		
		//access
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
	}
}
