package Interfaces;
interface Computer{
    void code();
}
class Laptop implements Computer{ //creating a object of laptop for developer
    @Override
    public void code(){
        System.out.println("code, compile and run");
    }
}
class Desktop implements Computer{
    @Override
    public void code(){
        System.out.println("Code, compile and execute faster");
    }
}
class Developer{ //providing the laptop object for developer
    public void devApp(Computer lap){
        lap.code();
    }
}
public class first {
    public static void main(String[] args) {
        Computer dekstop1 = new Desktop();
        Computer lap = new Laptop(); //making laptop object
        Developer d1 = new Developer(); //making developer object
        // d1.devApp(lap);//calling the method to run
        // dekstop1.devApp();
        d1.devApp(lap);
        dekstop1.code();
        
    }
}
