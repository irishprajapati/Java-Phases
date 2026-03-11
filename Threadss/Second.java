//package Threadss;
//
//class NumberOne extends Thread{
//    public void run(){
//        for(int i = 1; i<=5; i++){
//            System.out.println(i);
//            try{
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//class NumberSecond extends Thread{
//    public void run(){
//        for(int i = 6; i<=20; i++){
//            System.out.println(i);
//            try{
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//public class Second {
//    public static void main(String[] args) {
//        NumberOne t1 = new NumberOne();
//        NumberSecond t2 = new NumberSecond();
//        t1.start();
//        t2.start();
//
//    }
//}
package Threadss;
class NumberOne extends Thread {

    public void run() {

        for(int i = 1; i <= 5; i++) {

            System.out.println(i);

            try {
                Thread.sleep(500);
            } catch(Exception e) {}

        }

    }

}

class NumberTwo extends Thread {

    public void run() {

        for(int i = 6; i <= 10; i++) {

            System.out.println(i);

            try {
                Thread.sleep(500);
            } catch(Exception e) {}

        }

    }

}

public class Second {

    public static void main(String[] args) {

        NumberOne t1 = new NumberOne();
        NumberTwo t2 = new NumberTwo();

        t1.start();
        t2.start();

    }

}