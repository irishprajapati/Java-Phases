package Map;

import java.util.HashMap;
import java.util.Map;

public class first {
    public static void main(String[] args) {
        Map<Integer, String> attendance = new HashMap<>();
        //key = integer and value = String
        attendance.put(102, "salin");
        attendance.put(103, "salin");
        attendance.put(104, "salin");
        attendance.put(105, "salin");
        attendance.put(101, "salin");
      //  System.out.println(attendance);
        System.out.println("Student with roll no 102: "+ attendance.get(102) );

        for(Map.Entry<Integer, String> entry: attendance.entrySet()){
            System.out.println("Roll: " + entry.getKey() + " Name: " + entry.getValue() + " Class: " + entry.getClass());
        }
    }

}
