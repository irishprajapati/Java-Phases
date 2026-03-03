package MethodOverriding;
class A{
    public void show(){
        System.out.println("in show method");
    }
    public void config(){
        System.out.println("in A config");
    }
}
class B extends A{
    public void show(){
        System.out.println("in show of B");
    }

}
public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj.config();
        B data = new B();
        data.show();
    }
}
