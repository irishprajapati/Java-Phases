// class Pen{
//     String Color;
//     String Type;

//     public void write(){
//         System.out.println("Writing something");
//     }
//     public void printColor(){
//         System.out.println(this.Color);
//     }
// }
// public class first{
//     public static void main(String[] args) {
//         Pen pen1 = new Pen(); //object creation
//         pen1.Color = "blue";
//         pen1.Type = "gel";
//         Pen pen2 = new Pen();
//         pen2.Color = "black";
//         pen2.Type = "ballpoint";
//         pen1.printColor();
//         pen2.printColor();
//     }
// }

class Student{
    String name;
    int age;
    public void getInformation(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("Constructor called");
    }
}

public class first{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "erish";
        s1.age = 20;
        Student s2 = new Student();
        s2.name = "hitesh";
        s2.age = 29;
        s1.getInformation();
        s2.getInformation();

    }
}
