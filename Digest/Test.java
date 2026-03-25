package Digest;
enum DAY{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
}
interface Printable{
    void print();
}
class MyNumber extends Number implements Printable{
    private final int value;
    public MyNumber(int value){
        this.value = value;
    }
    @Override
    public void print(){
        System.out.println("My number: " + value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
//first class then interface should be declare in bounded type parameter
class Boxx<T extends Number & Printable>{
    private T item;
    public Boxx(T item)
    {
        this.item = item;
    }
    public void display(){
        item.print();
    }

}
public class Test {
    static void main(String[] args) {
        MyNumber myNumber = new MyNumber(100);
        Boxx<MyNumber> boxx = new Boxx<>(myNumber);
        boxx.display();
        DAY day = DAY.MONDAY;
        System.out.println(day);
    }
}
