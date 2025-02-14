package week5.day5.student_processing;

public class ResultProcessing implements InfResultProcessing{
	@Override
	public double calculateTotal(double dcn_cn, double dcn_db, double pop_ds) {
		return dcn_cn+dcn_db+pop_ds;
	}
	@Override
	public double calcuateAverage(double total) {
		return total/Global.SUBJECTS;
	}
	@Override
	public String calculateResult(double dcn_cn, double dcn_db, double pop_ds) {
		String result="FAIL";
		if((dcn_cn>=Global.PM) && (dcn_db>=Global.PM) && (pop_ds>=Global.PM))
			result="PASS";
		return result;
	}
}