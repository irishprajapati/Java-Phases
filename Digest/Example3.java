package Digest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
//        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x+y)%2 ==0;
//        System.out.println(isSumEven.test(10,9));
//        BiConsumer<Integer, String> biConsumer = (x, y) ->{
//            System.out.println(x);
//            System.out.println(y);
//        };
        //method refernece --> using method without invoking and in place of lambda expression
        List<String> students = Arrays.asList("Ram", "sundar", "Ashish");
        //this is the method reference
        students.forEach(System.out::println);

        //constructor reference
        List<String> names = Arrays.asList("Iphone", "samsung", "vivo");
        names.stream().map(Mobile::new).collect(Collectors.toList());
    }
}
class Mobile{
    String name;
    public Mobile(String name){
        this.name = name;
    }
}
