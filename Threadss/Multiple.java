package Threadss;
class TaskA extends Thread {

    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println("Task A running");
        }
    }

}

class TaskB extends Thread {

    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println("Task B running");
        }
    }

}

class TaskC extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println("Task C running");
        }
    }

}

public class Multiple {

    public static void main(String[] args) {

        TaskA t1 = new TaskA();
        TaskB t2 = new TaskB();
        TaskC t3 = new TaskC();

        t1.start();
        t2.start();
        t3.start();

    }

}
//
//class TaskA extends  Thread{
//    public void run(){
//        for(int i = 1; i<=3; i++){
//            System.out.println("Task A running...");
//        }
//    }
//}
//class TaskB extends Thread{
//    public void run(){
//        for(int i = 1; i<=3; i++){
//            System.out.println("Task B running...");
//        }
//    }
//}
//class TaskC extends Thread{
//    public void run(){
//        for(int i = 1; i<=3; i++){
//            System.out.println("Task C running...");
//        }
//    }
//}
//public class Multiple {
//    public static void main(String[] args) {
//        TaskA t1 = new TaskA();
//        TaskB t2 = new TaskB();
//        TaskC t3 = new TaskC();
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//    }
//}
