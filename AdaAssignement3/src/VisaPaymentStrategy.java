public class VisaPaymentStrategy implements PaymentStrategy{
    private double transactionFeePercentage;

    public VisaPaymentStrategy(double transactionFeePercentage) {
        this.transactionFeePercentage = transactionFeePercentage;
    }

    @Override
    public double calculateTransactionFee(double transactionAmount) {

        return transactionAmount * (transactionFeePercentage / 100);
    }
}
