
package Inner;

abstract class Animal{
    abstract void speak();
    abstract void eat();

}
public class wildlife{
    public static void main(String[] args) {
        Animal a1 = new Animal() {
            @Override
            void speak(){
                System.out.println("Animal speaking...");
            }
            @Override
            void eat(){
                System.out.println("Animal eats");
            }
            
        };
        a1.speak();
        a1.eat();
        
    }
}