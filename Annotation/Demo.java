package Annotation;
class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A show");
    }
}
class B extends A{
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In B show");
    }
}
public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
