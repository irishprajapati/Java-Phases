class Student{
    int rollno;
    String name;
    int marks;
}


public class Arrayobj{
    public static void main(String[] args) {

        //object creation for student
        Student data = new Student();
        data.rollno = 1;
        data.name = "erish";
        data.marks = 90;

        Student data2 = new Student();
        data2.rollno=2;
        data2.name = "sammaym";
        data2.marks = 90;

        Student data3 = new Student();
        data3.rollno = 9;
        data3.name= "data";
        data3.marks = 10;
        Student students[] = new Student[3]; //array of 3 student reference
        students[0] = data;
        students[1] = data2;
        students[2] = data3;
        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].name + ":" + students[i].marks);
        }

        // int [] nums = new int [6];
        // nums[0] = 4;
        // nums[1] = 5;
        // nums[2] = 6;
        // nums[3] = 9;
        // for(int i = 0; i < 6; i++){
        //     System.out.println(nums[i]);
        // }
    }
}