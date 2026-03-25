package Generics;

public class AccessibleAnything {
    public static void main(String[] args) {
        Anything <Integer> data = new Anything<>(10);
        System.out.println(data);

    Anything<String> datalist = new Anything<>("helloerish");
        System.out.println(datalist);
    }
}
