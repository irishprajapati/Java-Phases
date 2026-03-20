package StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
//        List<Integer> data = Arrays.asList(10,20,30,40,50);
//        data.forEach((Integer datas)-> System.out.println("Marks: " +datas));
//        int [] total = {0};
//        data.forEach(datas -> total[0] += datas);
//        System.out.println("total: " + total[0]);
//        Map<Integer, String> inventory = new HashMap<>();
//        inventory.put(1,"apples");
//        inventory.put(2,"banana");
//        inventory.put(3,"cherry");
//        inventory.put(4, "mango");
//        inventory.forEach((quantity, item)-> System.out.println(item + " => " + quantity));
        List<Integer> nums = Arrays.asList(10,20,80,90);
        Stream<Integer> s1 = nums.stream();
        s1.filter(a-> a%2 == 0);
        s1.forEach(n-> System.out.println(n));
        Stream<Integer> s2 = nums.stream()

    }
}
