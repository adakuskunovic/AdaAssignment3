import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
            ArrayList<CustomerOrder> orders = WorkWithFiles.ReadCustomerOrder();
            Report report = new Report(orders);
            report.report1();
            report.report2();
            report.report3();
        }








    }


