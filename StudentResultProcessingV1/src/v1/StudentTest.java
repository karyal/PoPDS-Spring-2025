package v1;

public class StudentTest {

	public static void main(String[] args) {
		StudentResult sr = new StudentResult();
		
		BasicIO bio = new BasicIO();
		bio.printMessage("Enter SID : ");
		Integer tmpID = bio.readInteger();
		bio.printMessage("Enter NAME : ");
		String name=bio.readString();
		bio.printMessage("Enter COURSE : ");
		String course=bio.readString();
		bio.printMessage("Enter LEVEL : ");
		String level=bio.readString();
		bio.printMessage("Enter MARKS DCN-CN : ");
		Double dcn_cn=bio.readDouble();
		bio.printMessage("Enter MARKS DCN-DB : ");
		Double dcn_db=bio.readDouble();
		bio.printMessage("Enter MARKS POP-DS : ");
		Double pop_ds=bio.readDouble();
		
		sr.setPID(tmpID);
		sr.setFullName(name);
		sr.setCourse(course);
		sr.setLevel(level);
		sr.setDCNCN(dcn_cn);
		sr.setDCNDB(dcn_db);
		sr.setPOPDS(pop_ds);
		
		//Result Processing
		ResultProcessing rp = new ResultProcessing();
		double tmpTotal = rp.calculateTotal(sr.getDCNCN(), sr.getDCNDB(), sr.getPOPDS());
		sr.setTotal(tmpTotal);
		double tmpAvg = rp.calcuateAverage(tmpTotal);
		sr.setAverage(tmpAvg);
		String tmpResult=rp.calculateResult(sr.getDCNCN(), sr.getDCNDB(), sr.getPOPDS());
		sr.setResult(tmpResult);
		
		System.out.println(sr);

	}

}
