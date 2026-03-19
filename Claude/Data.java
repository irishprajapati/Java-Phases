package Claude;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StudentData{
    private Long id;
    private String name;
    private int marks;
    public StudentData(Long id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
public class Data {
    public static void main(String[] args) {
        List<StudentData> students = new ArrayList<>();
        students.add(new StudentData(1l,"anish", 90));
        students.add(new StudentData(2l, "prithivi", 98));
        students.add(new StudentData(3l, "anisha", 89));
        students.add(new StudentData(4l,"rusha", 99));
        students.add(new StudentData(5l, "gyan", 90));
        Comparator<StudentData> studentDataComparator = Comparator.comparingInt(StudentData::getMarks).reversed().thenComparing(StudentData::getName);
        students.sort(studentDataComparator);
        for(StudentData s: students){
            System.out.println(s);
        }
    }
}
