package week4.day3;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c1;
		c1=new Calculator();
		c1.setFirstNumber(4);
		c1.setSecondNumber(5);
		c1.setThirdNumber(c1.getFirstNumber()+c1.getSecondNumber());
		System.out.println(c1);
		
		
		Calculator c01=new Calculator();
		Calculator c02 = new Calculator(4,5);
		Calculator c03=new Calculator(5,6,11);
		
	}

}
