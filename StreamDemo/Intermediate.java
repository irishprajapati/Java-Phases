package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intermediate {
   public static void main(String[] args) {
        List<String> lists = Arrays.asList("erish", "shyam", "ram", "hariiii");
       Stream<String> filteredStream = lists.stream().filter(x -> x.startsWith("e")); //no filtering up to this point
//       long result =  lists.stream().filter(x -> x.startsWith("e")).count();
//       System.out.println(result);
//    //2. map
       Stream<String> UpperCased = lists.stream().map(String::toUpperCase);
       //3. operation sorted list
       Stream<String> sortedStream = lists.stream().sorted();
     //  4. distinct
//       System.out.println(lists.stream().filter(x-> x.startsWith("h")).count());
       System.out.println(lists.stream().filter(x-> x.startsWith("e")).distinct().count());
       //limit operation
       System.out.println(Stream.iterate(1, x->x+1).limit(100).count());

       //skip operation
       System.out.println(Stream.iterate(1, x->x+1).skip(10).limit(100).count());
   }
}
