package StreamDemo;

import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String[] args) {
//        List<Integer> nums = List.of(1,2,3,4,5,6,7,8);
//        System.out.println(nums.stream().filter(x->x%2==0).toList());
//        List<String> names = List.of("ram", "sita", "hari");
//        System.out.println(names.stream().filter(x->x.length()>4).count());
//        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8);
//        List<Integer> squares = nums.stream().map(x-> x*x).toList();
//        System.out.println(squares);
//        List<String> names = Arrays.asList("esha", "rabindra", "asamyam", "sumanii");
//        System.out.println(names.stream().filter(name-> name.startsWith("a")).count());
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        System.out.println(numbers.stream().filter(evennums -> evennums % 2 == 0).map(x-> x * x));


    }

}
