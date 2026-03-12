package Set;

import java.util.HashSet;
import java.util.Set;

class StudentData{
    int id;
    String name;
    public StudentData(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        StudentData other = (StudentData) obj;
        return id == other.id && name.equals(other.name);
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + name.hashCode();
        return result;
    }
    @Override
    public String toString() {
        return "StudentData{id=" + id + ", name='" + name + "'}";
    }
}

public class Student {
    public static void main(String[] args) {
        StudentData student1 = new StudentData(1, "Ram");
        StudentData student2 = new StudentData(1, "Ram");
        Set<StudentData> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

    }

}
