package working.nested_classes;

public class Test {

	public static void main(String[] args) {
		Class1_1 obj1 = new Class1_1();
		Class1_1.Class1_2 obj1_1 = obj1.new Class1_2();
		
		Class1_1.Class1_2 obj1_2 = new Class1_1().new Class1_2();
		
		//obj1_1.f1();
		//obj1_2.f1();
		
		Class2_1 obj2_1=new Class2_1();
		obj2_1.f1();
	}
}