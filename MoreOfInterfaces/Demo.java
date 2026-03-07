package MoreOfInterfaces;
@FunctionalInterface
interface classOne{ //functional interface as it will only have one abstract method
    void show(int i);
    // void run();
}
// class B implements classOne{
//     @Override
//     public void show(){ /*public because the abstract method in interface is 
//         always public abstract method so i should mention public in the method*/
//         System.out.println("Print show");
//     }
// }
public class Demo {
    public static void main(String[] args) {
        classOne obj = (int i)-> /*use of lambda expression */System.out.println("In show as anonymous class" + i);
        obj.show(10);
    }
}
