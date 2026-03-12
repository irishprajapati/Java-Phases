package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(4);
        nums.add(8);
        nums.add(1);
        for(int n: nums){
            System.out.println(n);
        }
    }
}
