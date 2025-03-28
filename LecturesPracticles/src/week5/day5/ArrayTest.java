package week5.day5;

import java.util.Random;

public class ArrayTest {

	public static int getNumber() {
		Random random=new Random();
		Integer rNumber = random.nextInt(100);
		return(rNumber);
	}
	
	public static Integer[] generateNumbers(Integer []nums) {
		for(int i=0; i<Global.MAX; i++) {
			nums[i]=getNumber();
		}
		return nums;
	}
	
	public static void printNumbers(Integer []nums) {
		for(int i=0; i<Global.MAX; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
	
	public static Integer search(Integer []nums, Integer num) {
		Integer result=0;//Not found
		for(int i=0; i<Global.MAX; i++) {
			if(nums[i]==num)
				result++;
		}
		return result;
	}
	
	public static void sortASC(Integer []nums) {
		//Sorting array ascending
		//logical error?
		for(int i=0; i<Global.MAX; i++) {
			for(int j=0; j<Global.MAX; j++) {
				if(nums[j]<nums[i]) {
					//swap value
					Integer tmp = nums[j];
					nums[j]=nums[i];
					nums[i]=tmp;
				}
			}
		}
	}
	
	public static void sortDESC(Integer []nums) {
		//Sorting array descending
		//logical error?
		for(int i=0; i<Global.MAX; i++) {
			for(int j=0; j<Global.MAX; j++) {
				if(nums[j]<nums[i]) {
					//swap value
					Integer tmp = nums[j];
					nums[j]=nums[i];
					nums[i]=tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Integer nums[]=new Integer[Global.MAX];
		nums=generateNumbers(nums);
		printNumbers(nums);
		
		/*
		 * BasicIO bio=new BasicIO();
		bio.printMessage("Enter any number to search :");
		Integer tmp=bio.readInteger();
		Integer result = search(nums, tmp);
		String strResult=(result==0)? tmp+" not found!": tmp+" found "+result+" times!";
		bio.printMessage(strResult);
		*/
		sortASC(nums);
		printNumbers(nums);
	}
}
