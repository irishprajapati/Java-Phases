package Casting;

public class Demo {
    public static void main(String[] args) {
        int num = 7;
       // Integer num1 = new Integer(11); //line means it is depricated in future it might be removed
       //Integer num1 = new Integer(num); //boxing
        Integer num1 = num; //boxing new way(autoboxing)
        int num2 = num1.intValue();
        System.out.println(num2);
    }
}
