package week4.day5_2;

public class Class1 {
	private int n1;
	public Class1() {
		this.n1=0;
	}
	public Class1(int n1) {
		this.n1=n1;
	}
	public void setN1(int n1) {
		this.n1=n1;
	}
	public int getN1() {
		return this.n1;
	}
	@Override
	public String toString() {
		return Integer.toString(this.n1);
	}
}
