package week4.day5_2;

public class Class2 extends Class1{
	private int n2;
	
	public Class2() {
		super();
		this.n2=0;
	}
	public Class2(int n1, int n2) {
		super(n1);
		this.n2=n2;
	}
	@Override
	public void setN1(int n1) {
		super.setN1(n1);
	}
	public void setN2(int n2) {
		this.n2=n2;
	}
	@Override
	public int getN1() {
		return super.getN1();
	}
	public int getN2() {
		return this.n2;
	}
	@Override
	public String toString() {
		return super.toString()+", "+Integer.toString(this.n2);
	}
}
