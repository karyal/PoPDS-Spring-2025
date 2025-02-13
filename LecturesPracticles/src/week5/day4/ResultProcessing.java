package week5.day4;

public class ResultProcessing implements InfResultProcessing{
	@Override
	public double calculateTotal(double dcn_cn, double dcn_db, double pop_ds) {
		return dcn_cn+dcn_db+pop_ds;
	}
	@Override
	public double calcuateAverage(double total) {
		return total/3;
	}
	@Override
	public String calculateResult(double dcn_cn, double dcn_db, double pop_ds) {
		String result="FAIL";
		if((dcn_cn>=40) && (dcn_db>=40) && (pop_ds>=40))
			result="PASS";
		return result;
	}
}