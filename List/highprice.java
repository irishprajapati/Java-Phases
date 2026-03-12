package List;
import java.util.ArrayList;
import java.util.List;

public class highprice {
    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>();
        prices.add(100);
        prices.add(200);
        prices.add(500);
        prices.add(300);
        int highest = prices.get(0);
        for(int price: prices){
            if(price>highest ){
                highest = price;
            }
        }
        System.out.println("Highest Price: " + highest);

    }
}
