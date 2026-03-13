package Map;

import java.util.HashMap;
import java.util.Map;

class Student{
    private String name;
    private int rollNumber;
    private String location;
    public Student(String name, int rollNumber, String location){
        this.name = name;
        this.rollNumber = rollNumber;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
    public String getName(){
        return name;

    }
    public int getRollNumber()
    {
        return rollNumber;
    }
    @Override
    public String toString(){
        return "Name: " + name +
                ", Location: " + location +
                ", Roll Number: " + rollNumber;
    }
}
public class StudentManagement {
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        students.put(1, new Student("Anish", 1, "Kalimati"));
        students.put(2, new Student("Ashish", 2, "Asan"));
        students.put(3, new Student("Rupesh", 3, "Thamel"));
        students.put(4, new Student("Deepish", 4, "Kalimati"));
        students.put(5, new Student("Anish", 5, "India"));
        students.put(6, new Student("Kashish", 6, "Koteshwor"));
        System.out.println(students.get(1));
        for(Map.Entry<Integer, Student> s: students.entrySet()){
            System.out.println(s);
        }
//        Map<Integer, Student> studentsData = new HashMap<>();
//        for(Student std: students.values()){
//            studentsData.put(std.getLocation(), studentsData.getOrDefault(std.getLocation(),) + 1);
//        }

        //why is this printing the null
//        System.out.println(students.toString());
//        for(Map.Entry<Integer, Student> entry: students.entrySet()){
//            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
//        }

    }
}
