package Digest;

import java.lang.reflect.Array;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Example2 {
    public static void main(String[] args) {


//        //function  --> will take something input and provide something as output
//        Function<Integer, Integer> doubleIt = x -> 2 * x;
//        Function<Integer, Integer> TripleIt = x -> 3 * x;
////        System.out.println(doubleIt.andThen(TripleIt).apply(10));s
//        System.out.println(doubleIt.compose(TripleIt).apply(10));
//        //double it will gice me 20 and triple it will give me 40 which may be 60 as output
//        System.out.println(doubleIt.apply(10));

        //consumer
        Consumer <Integer> consumer = x -> System.out.println(x);
        consumer.accept(51);

    }
}
