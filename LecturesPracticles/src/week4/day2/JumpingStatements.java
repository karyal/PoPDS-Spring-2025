package week4.day2;

public class JumpingStatements {

	public static void main(String[] args) {
		//break
		
		//Example-1
		/*
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
			if(i==5)
				break; //exit from loop
		}
		*/
		
		//continue
		/*
		for(int i=1; i<=100; i++) {
			if(i==5)
				continue;//Escape to execute the following lines
			System.out.print(i+" ");
		}
		*/
		
		//return
		int n3 = sum(4, 5);
		System.out.println(n3);

	}
	
	public static int sum(int n1, int n2) {
		return n1+n2;
	}
	
}
