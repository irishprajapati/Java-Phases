package DuckingException;
class Data{
    public void show() throws ClassNotFoundException{
        Class.forName("DuckingException.Demod");
    }
}
public class Demo {
    static void main(String[] args) throws ClassNotFoundException {
        Data obj = new Data();
        obj.show();
    }
}
