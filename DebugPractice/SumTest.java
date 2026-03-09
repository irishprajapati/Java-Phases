package DebugPractice;

public class SumTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int sum = a + b; //error was at compile time because of missing semi colon
        System.out.println("Sum = " + sum);
    }
}
