public class MasterCardPaymentStrategy implements PaymentStrategy{
    private double transactionFeePercentage;

    public MasterCardPaymentStrategy(double transactionFeePercentage) {
        this.transactionFeePercentage = transactionFeePercentage;
    }

    @Override
    public double calculateTransactionFee(double transactionAmount) {

        return transactionAmount * (transactionFeePercentage / 100);
    }
}
