package Inheritance;
class A{

}
class B extends A{

}
class C extends B{

}
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
        VeryAdvCalc c1 = new VeryAdvCalc();
        int data = c1.add(10, 10);//object created but needs to be hold at the 
        int data1 = c1.sub(100, 20);
        int data2 = c1.multiply(2, 2);
        int data3 = c1.divide(4, 4);
        double data4 = c1.power(4,4);
        System.out.println(data1);
        System.out.println(data);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);
    }
}