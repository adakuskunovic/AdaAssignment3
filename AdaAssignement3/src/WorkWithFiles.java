import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkWithFiles {
    public static ArrayList<CustomerOrder> ReadCustomerOrder() {

        PaymentStrategy mastercard = new MasterCardPaymentStrategy(3);
        PaymentStrategy visa = new VisaPaymentStrategy(2);
        PaymentStrategy wallet = new WalletPaymentStrategy(0);
        PaymentStrategy bankcard = new BankCardPaymentStrategy(5);
        PaymentStrategy other = new BankCardPaymentStrategy(10);

        ArrayList<CustomerOrder> orders = new ArrayList<>();
        try(Scanner reader = new Scanner(new File("/Users/adakuskunovic/Desktop/AdaAssignement3/src/customer_orders.csv"))){

            reader.nextLine();
            while(reader.hasNextLine()) {
                //full_name	shirt_size	with_design	with_hoodie	payment

                String line = reader.nextLine();
                String[] subs = line.split(",");

                String name = subs[0];
                String size = subs[1];

                Boolean design = Boolean.parseBoolean(subs[2]);
                Boolean hoodie = Boolean.parseBoolean(subs[3]);
                String payment = subs[4];
                PaymentStrategy strategy = null;

                if(payment.equals("visa")) {
                    strategy = visa;
                }
                else if(payment.equals("mastercard")) {
                    strategy = mastercard;
                }

                else if(payment.equals("wallet")) {
                    strategy = wallet;
                }
                else if(payment.equals("bankcard")) {
                    strategy = bankcard;
                }
                else {
                    strategy = other;
                }

                orders.add(new CustomerOrder(name, size, design, hoodie, strategy));


            }

        } catch (Exception e) {
            // TODO: handle exception
        }

        return orders;
    }
}
