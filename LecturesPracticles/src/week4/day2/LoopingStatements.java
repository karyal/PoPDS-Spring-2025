package week4.day2;

public class LoopingStatements {

	public static void main(String[] args) {
		//Looping statements
		//Execute/run the code (statement(s)) multiple time
		
		//while loop
		//do while loop
		//for loop
		//foreach loop
		
		//while loop	
		//Example-1
		int start=1; //start
		int stop=5; //stop
		while(start<=stop) { //condition
			System.out.println("PCPS"); //statement(s)
			start++; //modifier
		}

		
		//Example-2
		/*
		int start=5;
		int stop=1;
		while(start>=stop) {
			System.out.println("PCPS");
			start--;
		}
		*/
		
		//2. do while loop
		//Example-3
		/*
		int start=0;
		int stop=5;
		do {
			System.out.print("PCPS ");
			start++;
		}while(start<stop);
		*/
		
		//3. for loop
		//Example-4
		/*
		for(int i=1; i<=5; i++) {
			System.out.print("pcps ");
		}
		*/
		
		//4. Nested Loop
		//Loop inside of another loop
		//outer loop and inner loop
		
		/*
		//1, 2, 3, 4, 5
		for(int i=1; i<=5; i++) {
			System.out.println(i+" ");
		}
		
		//10, 11, 12, 13, 14, 15
		for(int j=10; j<=15; j++) {
			System.out.println(j+" ");
		}
		*/
		/*
		//Example-5
		for(int i=1; i<=5; i++) { //outer loop
			System.out.println(i+" ");
			
			for(int j=10; j<=15; j++) { //inner loop
				System.out.println(j+" ");
			}
		}
		*/
		//1 outer loop -> N inner loop -> Execution process
		
		//for each loop -- vvip
		//Example-6
		/*
		int nums[];
		nums=new int[5];
		nums[0]=8;
		nums[1]=7;
		nums[2]=9;
		nums[3]=10;
		nums[4]=13;
		
		//accessing the element of an array
		for(int num: nums) {
			System.out.println(num+" ");
		}
		*/
	}
}
