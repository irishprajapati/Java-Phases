package Digest;
class Boxx2{
    public<T> Boxx2(T value){
        //now here the T wont understand the value of Type so i can use generic constructor

    }
}
public class GenericConstructor{
    public static void main(String[] args) {
        Boxx2 boxx2 = new Boxx2(12);
    }


}