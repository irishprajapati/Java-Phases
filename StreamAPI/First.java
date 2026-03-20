package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class First {
    public static void main(String[] args) {
    List<String> names = Arrays.asList("Erish", "salin", "alin", "anish");
//    names.forEach(new Consumer<String>() {
//        @Override
//        public void accept(String s) {
//            System.out.println(s);
//        }
//    });
        names.forEach((String name)-> System.out.println(name));
    }

}
