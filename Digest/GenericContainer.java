package Digest;
//making this class also generic that implements another generic class
public class GenericContainer<T> implements  DataInterfaces <T>{
    private T item;
    @Override
    public void add(T item) {
        this.item = item;
    }
    @Override
    public T get() {
        return item;
    }
}
