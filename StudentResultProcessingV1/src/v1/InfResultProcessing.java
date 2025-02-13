package v1;

public interface InfResultProcessing {
	public double calculateTotal(double dcn_cn, double dcn_db, double pop_ds);
	public double calcuateAverage(double total);
	public String calculateResult(double dcn_cn, double dcn_db, double pop_ds);
}