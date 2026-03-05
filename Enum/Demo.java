package Enum;
enum Status{
    Running, Failed, Pending, Success;
}
public class Demo {
    public static void main(String[] args) {
        Status s = Status.Failed;
        switch(s){
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }
        // if(s == Status.Running){
        //     System.out.println("All good");
        // }else if(s == Status.Failed){
        //     System.out.println("Try again");
        // }else if(s == Status.Pending){
        //     System.out.println("Please wait");
        // }else{
        //     System.out.println("Done");
        // }
    }
}
