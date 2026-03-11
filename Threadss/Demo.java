package Threadss;
class Z{

}
//class A implements Runnable{
//    public void run(){
//        for(int i = 1; i <=5; i++){
//            System.out.println("Printing hey");
//            try{
//                Thread.sleep(10);
//            }catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//}
class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());

            }
        }
    }
}

public class Demo {
    static void main(String[] args) {
//        Runnable obj1 = new A();//object creation for A
        Runnable obj1 = () -> {
            {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Printing hey");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        //Runnable obj2  = new B();//object creation for B
        Runnable obj2 = () ->{
            {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Printing hey");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        };
        }
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();


    }
}
