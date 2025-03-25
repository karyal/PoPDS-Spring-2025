package mylibs;

public class Student {
	private int sid;
	private String full_name;
	private String course;
	private String current_level;
	private String section;
	private int dcn;
	private int pop;
	private int total;
	private int average;
	private String result;
	
	public Student() { //default constructor
		this.sid = 0;
		this.full_name = "";
		this.course = "";
		this.current_level = "";
		this.section = "";
		this.dcn = 0;
		this.pop = 0;
		this.total = 0;
		this.average = 0;
		this.result = "";
	}
	public Student(int sid, String full_name, String course, String current_level, String section, int dcn, int pop) { //Parameterized
		this.sid = sid;
		this.full_name = full_name;
		this.course = course;
		this.current_level = current_level;
		this.section = section;
		this.dcn = dcn;
		this.pop = pop;
		this.total = 0;
		this.average = 0;
		this.result = "";
	}
	
	public Student(Student student) { //Copy Constructor
		this.sid = student.sid;
		this.full_name = student.full_name;
		this.course = student.course;
		this.current_level = student.current_level;
		this.section = student.section;
		this.dcn = student.dcn;
		this.pop = student.pop;
		this.total = student.total;
		this.average = student.average;
		this.result = student.result;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCurrent_level() {
		return current_level;
	}
	public void setCurrent_level(String current_level) {
		this.current_level = current_level;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getDcn() {
		return dcn;
	}
	public void setDcn(int dcn) {
		this.dcn = dcn;
	}
	public int getPop() {
		return pop;
	}
	public void setPop(int pop) {
		this.pop = pop;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", full_name=" + full_name + ", course=" + course + ", current_level="
				+ current_level + ", section=" + section + ", dcn=" + dcn + ", pop=" + pop + ", total=" + total
				+ ", average=" + average + ", result=" + result + "]";
	}
}
