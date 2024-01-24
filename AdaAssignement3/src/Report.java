import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Report {

    private ArrayList<CustomerOrder> orders;



    public Report(ArrayList<CustomerOrder> orders) {
        this.orders = orders;
    }

    public  void report1() {

        try(FileWriter writer = new FileWriter("src/customer/report1.txt")){
            writer.write("Total Revenue " + orders.size()*40);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public  void report2() {

        try(FileWriter writer = new FileWriter("src/customer/report2.txt")){
            double profit = orders.size()*40;
            profit = profit - orders.size()*14;
            for (CustomerOrder order : orders) {

                if(order.isWith_hoodie()) profit = profit - 3;
                if(order.isWith_design()) profit = profit - 2;

                profit = profit - order.calculateTransactionFee(40);


            }
            writer.write("Total Profit " + profit);
        }
        catch (Exception e) {
            // TODO: handle exception
        }
    }

    public  void report3() {

        double price = 40;

        try(FileWriter writer = new FileWriter("src/customer/report3.txt")){
            Map<String, Double> mapa = new HashMap<>();
            for (CustomerOrder order : orders) {
                String key = order.getShirt_size();
                double shirtProfit = price - 14 - (order.isWith_design()?2:0) - (order.isWith_hoodie()?3:0) - order.calculateTransactionFee(40) ;

                if(!mapa.containsKey(key)) {
                    mapa.put(key, shirtProfit);
                }
                else {
                    mapa.put(key, mapa.get(key)+shirtProfit);
                }
            }

            double total = 0;
            for(String key : mapa.keySet()) {
                String uljepsano = String.format("%s, profit: %f\n", key, mapa.get(key));
                total += mapa.get(key);
                writer.write(uljepsano);
            }
            writer.write("Total: " + total);

        }
        catch (Exception e) {
            // TODO: handle exception
        }
    }

}


