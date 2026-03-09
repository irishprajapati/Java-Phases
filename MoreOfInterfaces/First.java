package MoreOfInterfaces;

interface MathOperation{
    int operate(int a, int b);
}
public class First {
    public static void main(String[] args) {
        MathOperation add = (int a, int b) -> a+b; 
        MathOperation subtract = (int a, int b) -> a-b;
        MathOperation divide = (int a, int b) -> a/b;
        MathOperation multiply = (int a, int b) -> a*b;
        System.out.println(divide.operate(22, 2));
        System.out.println(multiply.operate(9, 1));
        System.out.println(subtract.operate(10,2));
        System.out.println(add.operate(10, 20));
    }
}
