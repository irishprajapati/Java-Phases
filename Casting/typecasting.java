package Casting;
class A{
    public void show1()
    {
        System.out.println("In A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("In B show");
    }

}
public class typecasting {
    public static void main(String[] args) {
        //upcasting
        // A obj = (A) new B();
        // obj.show1();
        //downcasting
        //lets first upcaste
        A obj = new B(); //with refernce to A object 
        obj.show1(); //only access the show method of class A
        B obj1 = (B) obj;
        obj1.show2();
    }
}
