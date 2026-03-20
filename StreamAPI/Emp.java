package StreamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Emp {
    public static void main(String[] args) {
        List<String> emps = Arrays.asList("erish", "anish", "samyam", "prithivi");
        emps.forEach(data->{
            if(data.startsWith("e") || data.startsWith("a")){
                System.out.println("Senior trace: " + data);
            }else{
                System.out.println("Junior trace: " + data);
            }
        });
    }
}
