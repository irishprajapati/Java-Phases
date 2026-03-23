package Generics;

import java.util.ArrayList;
class MyGeneric<T1>{
    int value = 23;
    private T1 t1;
    public MyGeneric(int value, T1 t1){
        this.value = value;
        this.t1= t1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class First {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add(23);
//        int a = arrayList.get(0);
//        System.out.println(a);

//        System.out.println(a);
        MyGeneric<String> g1 = new MyGeneric(23, "StringData");
        String result = g1.getT1() +" " +  g1.getValue();
        System.out.println(result);
    }
}
