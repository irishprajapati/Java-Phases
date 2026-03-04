package Casting;
abstract class DatabaseConnection{
    abstract void connect();
    abstract void disconnect();
    public final void connectInfo(){
        System.out.println("Intializing Connection");
    }
}
class MySQLConnection extends DatabaseConnection{
    @Override
    void connect(){
        System.out.println("MYSQL connected succesfully");
    }
    @Override
    void disconnect(){
        System.out.println("MYSQL disconnected successfully");
    }
}
class PostgreSQLConnection extends MySQLConnection{
    @Override
    void connect(){
        System.out.println("PostgreSQL connected succesfully");
    }
    @Override
    void disconnect(){
        System.out.println("PostgreSQL disconnected successfully");
    }

}
public class Connection {
    public static void main(String[] args) {
        DatabaseConnection data1 = new MySQLConnection();
        data1.connectInfo();
        data1.connect();
        data1.disconnect();
    }
    
}
