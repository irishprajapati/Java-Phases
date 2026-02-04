class Computer{
    public void playMusic() //just perform some operations doesnt give back anything
    {
        //this is where i will define the behavior of this particular method
        System.out.println("Music playing");
    }
    public void getDatabaseConnection(){
        System.out.println("Database connected successfully");
    }
    public String getMeFood(int cost){
        if (cost>=10)
            return "Food";
        else
            return "Amount not meet required specifications";
    }
} 
public class firstmethod{
    public static void main(String[] args) {  
    Computer info = new Computer();//object creation done
    info.getDatabaseConnection();
    String data = info.getMeFood(1);
    System.out.println(data);
    }
}