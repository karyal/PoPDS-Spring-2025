package week5.day4;

public class ArrayTest2 {

	public static void main(String[] args) {
		//Declare an array
		Integer nums[]= {8, 6, 4, 9, 5};
		Integer sum=0;
		
		//Calculate and print sum
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
		}
		System.out.println("SUM : "+sum);
		
		//Calculate and print average
		Double average = (double) sum / nums.length;
        System.out.println("Average: " + average);
        
		//find and print max
        
		//find and print min
		//search 5 found
		//search 7 not found
	}

}
