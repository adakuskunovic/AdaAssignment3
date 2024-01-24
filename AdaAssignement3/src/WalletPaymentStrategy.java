public class WalletPaymentStrategy implements PaymentStrategy{

    private double transactionFeePercentage;

    public WalletPaymentStrategy(double transactionFeePercentage) {
        this.transactionFeePercentage = transactionFeePercentage;
    }

    @Override
    public double calculateTransactionFee(double transactionAmount) {

        return transactionAmount * (transactionFeePercentage / 100);
    }
}