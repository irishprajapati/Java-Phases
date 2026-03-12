package List;

import java.util.ArrayList;
import java.util.List;

public class totalprice {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();
        prices.add(100.0);
        prices.add(200.0);
        prices.add(300.0);
        for(double price: prices){
            for(int i = 0; i< args.length; i++){
                System.out.println(i);
            }
//            System.out.println(price);
        }
    }
}
