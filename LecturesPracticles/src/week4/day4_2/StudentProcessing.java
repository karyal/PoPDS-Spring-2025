package week4.day4_2;

public class StudentProcessing {
	
	public Student calculateTotal(Student student) {
		int total=student.getDCNDB()+student.getDCNCN()+student.getPOPDS();
		student.setTotal(total);
		return student;
	}
	
	public Student calculatePercentage(Student student) {
		int total=student.getTotal();
		int percentage=total/3;
		student.setPercentage(percentage);
		return student;
	}
	
	public Student calculateResult(Student student) {
		int PM=50;//Pass Marks
		String result="FAIL";
		if((student.getDCNCN()>=PM) && (student.getDCNDB()>=PM) && (student.getPOPDS()>=PM))
			result="PASS";
		student.setResult(result);
		return student;
	}
}