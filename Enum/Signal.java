package Enum;
enum TrafficSignal{
    RED(60),
    GREEN(45),
    YELLOW(5);
    private final int duration;
    TrafficSignal(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }
    TrafficSignal next(){
        switch(this){
            case RED -> {
                return GREEN;
            }
            case GREEN -> {
                return YELLOW;
            }
            case YELLOW -> {
                return RED;
            }
            default -> System.out.println("print error");
        }
                return null;
    
    }
}
public class Signal {
    public static void main(String[] args) {
        TrafficSignal signal1 =  TrafficSignal.GREEN;
        for(int i = 0; i<6; i++){
            System.out.println("Current Signal: " + signal1);
            System.out.println("Duration: " + signal1.getDuration() + " seconds");
            System.out.println("-----------------------");
            signal1 = signal1.next();
        }
    }
    
}
