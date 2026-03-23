package Generics;

import java.util.List;

public class Utils {
//    public static <T> void printTwice(T item) { //why is there T in this method you said when the type is unknown then we can use T? and in method here why?
//        System.out.println(item);
//        System.out.println(item);
//    }
//
//    public static <T> T getFirst(List<T> list) {//what does this code means why are you confusing me claude
//        return list.get(0); //this means get the item of index 0 of  the list yes?
//
//    }
    public static <T extends Comparable<T>> T max( T a, T b){
        return a.compareTo(b) > 0? a: b;
    }
}
