public class CustomerOrder {
    private String full_name;
    private String shirt_size;
    private boolean with_design;
    private boolean with_hoodie;
    private PaymentStrategy paymentStrategy;


    public CustomerOrder(String full_name, String shirt_size, boolean with_design, boolean with_hoodie, PaymentStrategy paymentStrategy) {
        this.full_name = full_name;
        this.shirt_size = shirt_size;
        this.with_design = with_design;
        this.with_hoodie = with_hoodie;
        this.paymentStrategy = paymentStrategy;
    }


    public String getFull_name() {
        return full_name;
    }


    public String getShirt_size() {
        return shirt_size;
    }



    public boolean isWith_design() {
        return with_design;
    }



    public boolean isWith_hoodie() {
        return with_hoodie;
    }


    public double calculateTransactionFee(double price) {
        return paymentStrategy.calculateTransactionFee(price);

    }


}
