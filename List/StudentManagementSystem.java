package List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    public static void main(String[] args) throws IOException {
    List<String> students = new ArrayList<>();
    students.add("satik");
    students.add("AniSh");
    students.add("PRITHIVI");
    students.add("neelam");
    students.replaceAll(String::toLowerCase);
    System.out.println("Works here fine:"+ students);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter student name to search: ");
    String input = br.readLine().toLowerCase();
    if(students.contains(input)){
        System.out.println("Student found: "+ input);

    }else{
        System.out.println("Student not found: " + input);
    }
    }
}
