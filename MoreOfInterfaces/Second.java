package MoreOfInterfaces;

interface A{
    int add(int i, int j);
}
public class Second {
    public static void main(String[] args) {
        A obj = (int i, int j) -> i + j;
        int result = obj.add(11, 1);
        System.out.println(result);
        
        
        
    }
}
