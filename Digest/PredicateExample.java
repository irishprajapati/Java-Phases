package Digest;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //predicate is functional interface
//        Predicate <Integer> isEven= x -> x% 2 == 0;
//        System.out.println(isEven.test(9));//holds the condition to check
        Predicate<String> isWordStartwithA = x->x.toLowerCase().startsWith("A");
       // System.out.println(isWordStartwithA.test("Ankit"));
        Predicate<String> isWordEndwithS = x->x.toLowerCase().startsWith("S");
        //System.out.println(isWordEndwithS.test("Datas"));
        Predicate<String> and = isWordStartwithA.and(isWordEndwithS);
        System.out.println(and.test("AkubernateS"));
    }
}
