package week4.day4_2;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setPID(1);
		s1.setFullName("Raju Rai");
		s1.setCourse("BSc SE");
		s1.setLevel("Level-4");
		s1.setSection("C");
		s1.setDCNCN(67);
		s1.setDCNDB(89);
		s1.setPOPDS(56);
		
		StudentProcessing sp = new StudentProcessing();
		s1 = sp.calculateTotal(s1);
		s1 = sp.calculatePercentage(s1);
		s1 = sp.calculateResult(s1);
		System.out.println(s1);

	}

}
