package StreamDemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class first {
    public static void main(String[] args) {
        //stream - feature in java 8 introduced which helps to process collections(list, map and queue)
        //using streams
        //source -> intermediate operation -> terminal operation
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        int count = 0;
//        for(int i: numbers){
//            if(i%2==0)
//                count++;
//        }
//        System.out.println(count);
//        System.out.println(numbers.stream().filter(x->x%2==0).count());
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,6);


    }
}
