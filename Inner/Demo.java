package Inner;

class A{
    int age;
    public void show(){
        System.out.println("In A show");
    }
    static class B{
        public void config(){
            System.out.println("In cofig");
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        //using the class B now
        A.B obj1 = new A.B();
        obj1.config();
    }
}
