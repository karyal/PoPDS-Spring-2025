package week4.day4;
//Categories of method
public class MethodTest3 {

	//no parameter; no return type
	public void hello() {
		System.out.println("Hello from hello()");
	}
	//no parameter; return type
	public int getSum() {
		return (6+7);
	}
	//parameterized; not return type
	public void printValue(int num1) {
		System.out.println("Value : "+num1);
	}
	//parameterized and return type
	public int getSum2(int n1, int n2) {
		return (n1+n2);
	}
	
	public static void main(String[] args) {
		new MethodTest3().hello();
		int num1 = new MethodTest3().getSum();//getting value from method
		new MethodTest3().printValue(num1); //sending value to method
		int num2 = new MethodTest3().getSum2(45, 56);//send values and get value
		new MethodTest3().printValue(num2); //sending value to method
	}
}






