public class OtherPaymentsStrategy implements PaymentStrategy{

    private double transactionFeePercentage;

    public OtherPaymentsStrategy(double transactionFeePercentage) {
        this.transactionFeePercentage = transactionFeePercentage;
    }

    @Override
    public double calculateTransactionFee(double transactionAmount) {

        return transactionAmount * (transactionFeePercentage / 100);
    }

}
