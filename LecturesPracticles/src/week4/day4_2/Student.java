package week4.day4_2;

public class Student extends Person{
	private String course;
	private String level;
	private String section;
	private int dcn_db;
	private int dcn_cn;
	private int pop_ds;
	private int total;
	private int percentage;
	private String result;
	//Constructors
	public Student() {
		this.course="";
		this.level="";
		this.section="";
		this.dcn_db=0;
		this.dcn_cn=0;
		this.pop_ds=0;
		this.total=0;
		this.percentage=0;
		this.result="";
	}
	public Student(String course, String level, String section, int dcn_db, int dcn_cn, int pop_ds) {
		this.course=course;
		this.level=level;
		this.section=section;
		this.dcn_db=dcn_db;
		this.dcn_cn=dcn_cn;
		this.pop_ds=pop_ds;
		this.total=0;
		this.percentage=0;
		this.result="";
	}
	//Setters
	public void setCourse(String course) {
		this.course=course;
	}
	public void setLevel(String level) {
		this.level=level;
	}
	public void setSection(String section) {
		this.section=section;
	}
	public void setDCNDB(int dcn_db) {
		this.dcn_db=dcn_db;
	}
	public void setDCNCN(int dcn_cn) {
		this.dcn_cn=dcn_cn;
	}
	public void setPOPDS(int pop_ds) {
		this.pop_ds=pop_ds;
	}
	public void setTotal(int total) {
		this.total=total;
	}
	public void setPercentage(int percentage) {
		this.percentage=percentage;
	}
	public void setResult(String result) {
		this.result=result;
	}
	//Getters
	public String getCourse() {
		return this.course;
	}
	public String getLevel() {
		return this.level;
	}
	public String getSection() {
		return this.section;
	}
	public int getDCNDB() {
		return this.dcn_db;
	}
	public int getDCNCN() {
		return this.dcn_cn;
	}
	public int getPOPDS() {
		return this.pop_ds;
	}
	public int getTotal() {
		return this.total;
	}
	public int  getPercentage() {
		return this.percentage;
	}
	public String getResult() {
		return this.result;
	}
	//toString
	@Override
	public String toString() {
		return super.getPID()+", "+super.getFullName()+", "+this.getCourse()+", "+this.getLevel()+", "+this.getSection()+", "+this.getDCNDB()+", "+this.getDCNCN()+", "+this.getPOPDS()+", "+this.getTotal()+", "+this.getPercentage()+", "+this.getResult();
	}
}