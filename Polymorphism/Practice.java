package Polymorphism;
//final keyword
//can be used with variable method, class
class Calculator{
    public final void show(){
        System.out.println("In Calculator-By erish");

    }
    public void add(int a, int b){
        System.out.println(a + b);
    }
}

class AdvanceCalc extends Calculator{
    @Override
    public void show(){
        System.out.println("In calculator by dataphishing");
    }

}
public class Practice {
    public static void main(String[] args) {
        // final int num = 8;
        // num = 10;
        // System.out.println(num);
        AdvanceCalc obj = new AdvanceCalc();
        obj.add(10, 1);
        obj.show();

    }
}
