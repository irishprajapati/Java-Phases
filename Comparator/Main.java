package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Professor{
    private Long id;
    private String name;
    private String department;
    public Professor(Long id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        List<Professor> professorList = new ArrayList<>();
        professorList.add(new Professor(1L,"Simanta", "BCA"));
        professorList.add(new Professor(2L, "pralhad", "CSIT"));
        professorList.add(new Professor(3L, "santosh", "BCA"));
        professorList.add(new Professor(4L, "sudipaa", "CSIT"));
        Comparator<Professor> BY_NAME = Comparator.comparing(Professor::getDepartment).thenComparing(Professor::getName).thenComparing(Professor::getId);
        professorList.sort(BY_NAME);
        for(Professor p: professorList){
            System.out.println(p);
        }
    }

}
