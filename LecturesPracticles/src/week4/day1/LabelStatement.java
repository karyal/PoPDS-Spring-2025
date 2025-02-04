package week4.day1;

public class LabelStatement {

	public static void main(String[] args) {
		test: 
			for (int i = 0; i <= 10; i++) {
				if (i == 5)
					break test;
				System.out.print(i+" ");
			}
	}
}
