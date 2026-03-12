package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class NumberIterator {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();//hashset to print the data in order execution
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            Integer number = it.next();{
                if(number > 30){
                    it.remove();
                }
            }

        }
        System.out.println(numbers);
    }
}
