package StreamDemo;

import java.util.stream.Stream;

private static long factorial(int n){
    long result = 1;
    for(int i = 2; i<=n; i++){
        result *= 1;
    }
    return result;
}
public class ParallelStreams {
    public static void main(String[] args) {
//        Stream.iterate(1, x-> x+1).limit(20000).toList();
        List<Integer> list = Stream.iterate(1, x-> x+1).limit(20000).toList();
        list.stream().map(ParallelStreams::factorial)



    }
}

