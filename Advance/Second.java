package Advance;

import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)return 1;
        else if (this.age<that.age) {
            return -1;
        }else{
            return 0;
        }
    }

}
public class Second {
    public static void main(String[] args) {
//        Comparator <String> comp = (a,b) ->{
//            if(a.length() > b.length()) return 1;
//            else if (a.length() < b.length()) {
//                return -1;
//            }else{
//                return 0;
//            }
//        };
//        List<String> users = new ArrayList<>();
//        users.add("anish");
//        users.add("prithivi");
//        users.add("salinaa");
//        users.add("samyamm");
//        users.add("sandesh");
//        Collections.sort(users,comp);
//        System.out.println(users);
        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "Nabin"));
        students.add(new Student(22, "Sita"));
        students.add(new Student(20, "Ram"));
        students.add(new Student(21, "Gita"));
        students.add(new Student(22, "Hari"));
        students.add(new Student(26, "Anish"));
        students.add(new Student(12, "Pooja"));
        students.add(new Student(22, "Ravi"));
        students.add(new Student(20, "Kiran"));
        students.add(new Student(50, "Sunita"));
        Collections.sort(students, Student::compareTo);
        //System.out.println(students);
        for(Student s: students){
            System.out.println(s);
        }
    }
}
