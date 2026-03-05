package Inner;
abstract class Task{
    abstract void execute();
}
public class first {
    public static void main(String[] args) {
        Task data1 = new Task(){
            @Override
            void execute(){
                System.out.println("Inside main method");
            }
        };
        data1.execute();
    }

}