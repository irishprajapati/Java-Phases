//package Threadss;
//class NumberScheduler implements Runnable{
//    public void run(){
//        for(int i = 0; i<=6; i++){
//            System.out.println(i);
//        }
//    }
//}
//class NumberSchedulerTwo implements Runnable{
//    public void run(){
//        for(int i = 0; i<=6; i++){
//            System.out.println(i);
//        }
//    }
//}
//public class NumberPrinter {
//    public static void main(String[] args) {
//        NumberScheduler num1 = new NumberScheduler();
//        NumberSchedulerTwo num2 = new NumberSchedulerTwo();
//        Runnable data1 = new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 6; i<=10; i++){
//                    System.out.println(i);
//                }
//            }
//        };
//        Runnable data2 = new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0; i<=6; i++){
//                    System.out.println(i);
//                }
//            }
//        };
//    }
//    Thread t1 = new Thread(data1);
//    Thread t2 = new Thread(data2);
//    t1.join();
//    t2.join();
//    t1.start();
//    t2.start();
//}

package Threadss;
class NumberScheduler implements Runnable{
    private int start;
    private int end;
    public NumberScheduler(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
    public void run(){
        for(int i = start; i<=end; i++){
//            System.out.println(Thread.currentThread().getName()+ " : "+ i);//get the name of the thread
            System.out.println(i);
        }
    }
}
public class NumberPrinter{
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new NumberScheduler(1,5));
        Thread t2 = new Thread(new NumberScheduler(6,10));
        t1.join();
        t2.join();
        t1.start();
        t2.start();
    }


}