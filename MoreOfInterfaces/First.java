package MoreOfInterfaces;

interface MathOperation{
    int operate(int a, int b);
}
public class First {
    public static void main(String[] args) {
        MathOperation add = (int a, int b) -> a+b; 
        System.out.println(add.operate(10, 20));
    }
}
