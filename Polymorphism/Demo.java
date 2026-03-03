package Polymorphism;

class A{//parent class
    public void show(){
        System.out.println("in A show");
    }
}
class B extends C{ //child class
    @Override
    public void show(){
        System.out.println("in B show");
    }

}
class C extends A{

}
public class Demo {
    public static void main(String[] args) {
        A data = new A();
        data.show();
    }
    
}
