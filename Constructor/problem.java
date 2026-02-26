package Constructor;

class Student{
    private String name;
    private int marks;

    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public void setName(String name){
        this.name = name; //so whenever the object is created the values will be assigned
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public Student(int marks){
        if (marks<0){
            System.out.println("Student marks cannot be negative");
            return;
        }
        if(marks>100){
            System.out.println("Student marks cannot be more than 100.");
        }else{
            return marks;
        }
    }
}
public class problem {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
