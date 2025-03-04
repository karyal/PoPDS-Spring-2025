package week5.day4.student_processing;

public class StudentResult extends Student{
	private double dcn_db;
	private double dcn_cn;
	private double pop_ds;
	private double total; //Total obtain marks
	private double average;//percentage
	private String result; //PASS or FAIL
	
	//Constructors
	public StudentResult() {
		this.dcn_cn=0.0;
		this.dcn_db=0.0;
		this.pop_ds=0.0;
		this.total=0.0;
		this.average=0.0;
		this.result="";
	}
	public StudentResult(double dcn_cn, double dcn_db, double pop_ds) {
		this.dcn_cn=dcn_cn;
		this.dcn_db=dcn_db;
		this.pop_ds=pop_ds;
		this.total=0.0;
		this.average=0.0;
		this.result="";
	}
	//Setters
	public void setDCNCN(double dcn_cn) {
		this.dcn_cn=dcn_cn;
	}
	public void setDCNDB(double dcn_db) {
		this.dcn_db=dcn_db;
	}
	public void setPOPDS(double pop_ds) {
		this.pop_ds=pop_ds;
	}
	public void setTotal(double total) {
		this.total=total;
	}
	public void setAverage(double average) {
		this.average=average;
	}
	public void setResult(String result) {
		this.result=result;
	}
	//Getters
	public double getDCNCN() {
		return this.dcn_cn;
	}
	public double getDCNDB() {
		return this.dcn_db;
	}
	public double getPOPDS() {
		return this.pop_ds;
	}
	public double getTotal() {
		return this.total;
	}
	public double getAverage() {
		return this.average;
	}
	public String getResult() {
		return this.result;
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString()+", "+this.dcn_cn+", "+this.dcn_db+", "+this.pop_ds+", "+this.total+", "+this.average+", "+this.result;
	}
}











