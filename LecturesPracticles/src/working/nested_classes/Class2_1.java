package working.nested_classes;

public class Class2_1 {
	
	public void f1() {
		
		class Class2_2{
			public void f1() {
				System.out.println("Hello from f1 of class Class2_1->Class2_2");
			}
		}
		
		Class2_2 obj2=new Class2_2();
		obj2.f1();
	}
}

