package week4.day5_2;

public class Class3 extends Class2{
	private int n3;
	public Class3() {
		super();
		this.n3=0;
	}
	public Class3(int n1, int n2) {
		super(n1, n2);
		this.n3=0;
	}
	public Class3(int n1, int n2, int n3) {
		super(n1, n2);
		this.n3=n3;
	}
	//Setters for n1, n2, n3
	@Override
	public void setN1(int n1) {
		super.setN1(n1);
	}
	@Override
	public void setN2(int n2) {
		super.setN2(n2);
	}
	public void setN3(int n3) {
		this.n3=n3;
	}
	//Getters of n1, n2, n3
	@Override
	public int getN1() {
		return super.getN1();
	}
	@Override
	public int getN2() {
		return super.getN2();
	}
	public int getN3() {
		return this.n3;
	}
	//toString of n1, n2, n3
	@Override
	public String toString() {
		return super.toString()+", "+this.n3;
	}
}
