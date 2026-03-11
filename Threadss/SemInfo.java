package Threadss;

class SemesterFirst extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Exam schedule are updated at the viber");
            try{
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    void CollegeHour(){
        System.out.println("College hour are fixed as 7 AM to 10 AM");
    }
}
class SemesterSecond extends Thread{
    public void run(){
        System.out.println("Vacation holiday schedule is provided to respective classes");
    }

}
class ThirdSemester extends Thread{
    public void run(){
        for(int i = 1; i<= 10; i++){
            System.out.println("Proposal defense is scheduled to be on Saturday");
        }
    }
}
public class SemInfo {
    public static void main(String[] args) {
        SemesterFirst sem1 = new SemesterFirst();
        sem1.start();
        SemesterSecond sem2 = new SemesterSecond();
        sem2.start();
        ThirdSemester sem3 = new ThirdSemester();
        sem3.start();

    }
}
