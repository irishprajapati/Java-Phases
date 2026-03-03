class Database{
    static String url;
    static {
        url = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Static block executed");
    }
    void print(){
        System.out.println("DB URL: " + url);
    }
}
public class db{
    public static void main(String[] args) {
        Database db1 = new Database();
        Database db2 = new Database();
        db1.print();
        db2.print();
    }
}