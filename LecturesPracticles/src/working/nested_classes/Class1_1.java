package working.nested_classes;

class Class1_1 {
	public void f1() {
		System.out.println("Hello from f1() of Class1");
	}
	
	class Class1_2 {
		public void f1() {
			System.out.println("Hello from f1() of Class1-> Class2");
		}
	}
}