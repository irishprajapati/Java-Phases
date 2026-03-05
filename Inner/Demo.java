package Inner;
abstract class A{
    abstract public void show();
}
// class B extends A{
//     @Override
//     public void show(){
//         System.out.println("in B show");
//     }
// }
// class B extends A{

//     @Override
//     public void show() {
//         System.out.println("Unimplemented method 'show'");
//     }
    
// }
public class Demo {
    public static void main(String[] args) {
        // A data = new A()
        // {
        //     @Override
        //     public void show(){
        //         System.out.println("in new show");
        //     }
        // };
        // data.show();
        A obj = new A(){
            @Override
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();

        }
}
