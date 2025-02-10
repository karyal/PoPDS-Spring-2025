package week5.day1;

public class Test {

	public static void main(String[] args) {
		//Class1 obj1=new Class1();
		//Class2 obj2=new Class2();//use of Class
		
		//Class2 obj2= new Class2();
		
		/*
		SakarCalculator sc = new SakarCalculator();
		System.out.println(sc.prd(3, 4));
		System.out.println(new UjwalCalculator().sum(5, 6));
		System.out.println(new SakarCalculator().sub(5, 6));
		System.out.println(new UjwalCalculator().div(5, 2));
		*/
		
		//Style-1
		Inf2Implement obj1 = new Inf2Implement();
		System.out.println(obj1.sum(3, 5));
		
		//Style-2 - Preferred
		Inf2 obj2 = new Inf2Implement();
		System.out.println(obj2.prd(4, 5));
		
	}

}
