package Digest;
class Box<T extends Number>{ //number class is super class of the type defined later
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
class Pair<K,V>{
    private K key;
    private V value;
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue(){
        return value;
    }

}
public class Generics {
    public static void main(String[] args) {
//        Box<Integer> box1 = new Box<>();
//        box1.setValue(12);
//        int data = box1.getValue();
//        System.out.println(data);
//        Box<String> box2 = new Box<>();
//        box2.setValue("Hello this may be expired link! Please confirm");
//        System.out.println(box2.getValue());
//        Box<Double> paymentEncryption = new Box<>();
//        paymentEncryption.setValue(100.00);
//        System.out.println(paymentEncryption.getValue());
//        Pair<String, Integer> pairData = new Pair<>("Age", 20);
//        System.out.println(pairData.getKey() +": " +  pairData.getValue());
//        System.out.println(pairData.getValue());
        Box<Integer> box = new Box<>();
        box.setValue(11);
        System.out.println(box.getValue());

    }
}
