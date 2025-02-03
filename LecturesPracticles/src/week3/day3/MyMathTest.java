package week3.day3;

public class MyMathTest {
	public static void main(String []args){
		MyMath myMath=new MyMath();
		myMath.sum(); //call
		myMath.sum();
		int res = myMath.calcSum(34, 2);
		System.out.println(res);
		
		res = MyMath.calculateSum(56, 2); //calling static method
		System.out.println(res);
	}
}
