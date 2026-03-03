package superdemo;
class A extends Object{
    public A()
    {
        System.out.println("in A");
    }
    public A(int A){
        System.out.println("in integer A");
    }
}
class B extends A{
    public B(){
        super(5);
        System.out.println("In B");
    }
    public B(int n){
        super(n);
        System.out.println("in integer B");
    }

}
public class Demo {
    public static void main(String[] args) {
        B obj = new B();
    } 
}
