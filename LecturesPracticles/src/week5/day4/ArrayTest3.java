package week5.day4;
import java.util.Scanner;
public class ArrayTest3 {

	public static void main(String[] args) {
		//Declare and initialize array
		Integer nums[]=new Integer[5];
		//Sending array to method?
		//Receiving array from method?
		nums=input(nums);
		//calculate sum, average, max, min, find by using methods?
		output(nums);
	}
	
	public static Integer[] input(Integer nums[]) {
		for(int i=0; i<nums.length; i++) {
			System.out.print("Enter any number : ");
			nums[i] = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		return nums;
	}
	
	public static void output(Integer nums[]) {
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
