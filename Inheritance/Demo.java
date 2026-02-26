package Inheritance;

class Calculator{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
}
public class Demo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int data = c1.add(10, 10);
        int data1 = c1.sub(100, 20);
        System.out.println(data1);
        System.out.println(data);
    }
}