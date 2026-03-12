package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenRemover {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);

        Iterator<Integer> it = numbers.iterator();

        while(it.hasNext()){
            int num = it.next();
            if(num % 2 == 0){
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}

