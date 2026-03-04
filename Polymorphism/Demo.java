package Polymorphism;
// class Computer{

// }
// class Laptop extends Computer{

// }
class A{//parent class
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{ //child class
    @Override
    public void show(){
        System.out.println("in B show");
    }
}
class C extends A{
    @Override
    public void show(){
        System.out.println("In C show");
    }
}
public class Demo {
    public static void main(String[] args) {
        // B obj = new B(); //what happened here? -> created the B object reference
        // //when it run the program it printed the method of A as B is child class of A
        // obj.show();
        A obj = new A();//is-a relationship
        obj.show();
        // Computer obj1 = new Laptop(); //refering is-a relationship here
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
    }
}
