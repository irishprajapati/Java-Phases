package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        //collect
        list.stream().skip(1).toList();
        //forEach
        list.stream().forEach(x-> System.out.println(x));

        //reduce: combines the element to produce single result
        list.stream().reduce(Integer::sum);

        //any match, allmatch and noneMatch
        System.out.println(list.stream().anyMatch(x->x%2==0));
        System.out.println(list.stream().allMatch(x->x>0));
        System.out.println(list.stream().noneMatch(x->x>9));

        //find first and first any
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());
    }
}
