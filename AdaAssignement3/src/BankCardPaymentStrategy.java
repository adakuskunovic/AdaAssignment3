
public class BankCardPaymentStrategy implements PaymentStrategy{

    private double transactionFeePercentage;

    public BankCardPaymentStrategy(double transactionFeePercentage) {
        this.transactionFeePercentage = transactionFeePercentage;
    }

    @Override
    public double calculateTransactionFee(double transactionAmount) {

        return transactionAmount * (transactionFeePercentage / 100);
    }

}
