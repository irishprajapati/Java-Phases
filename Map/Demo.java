package Map;
import java.util.HashMap;
import java.util.Map;
public class Demo {
    public static void main(String[] args) {
        Map <String, Integer> students = new HashMap<>();
        students.put("Erish", 100);
        students.put("navin", 98);
        students.put("databyte", 90);
        students.put("harsh", 10);
        students.put("harsh", 100);
//        System.out.println(students.get("harsh"));
        System.out.println(students.keySet());
        for(String name: students.keySet()){
            System.out.println(name + ": " + students.get(name));
        }
    }
}
