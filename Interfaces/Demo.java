package Interfaces;
interface A{ //by default final and static variable
    int age = 20;
    String area = "anywhere";
    void show();
    void config();
}
class B implements A{
    @Override
    public void show(){
        System.out.println("in show");
    }
    @Override
    public void config(){
        System.out.println("in config");
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj; 
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.area);
        
    }
}
