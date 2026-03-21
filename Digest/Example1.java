package Digest;

public class Example1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            System.out.println("Hello in threads");

        });
        SumOperation s1 = new SumOperation();
        int result = s1.add(10,20);
        System.out.println(result);
//        int data = s1.subtract(100,90);
//        System.out.println(s1.subtract(100,90));
        MathOperation operation1 = (a, b)-> a + b;
        System.out.println(operation1.add(100,20));

    }
}
interface  MathOperation{
    int add(int a, int b);
//    public default int subtract(int a, int b){
//        return a - b;
//    }
}
class SumOperation implements  MathOperation{
    @Override
    public int add(int a, int b){
        return a + b;
    }
}