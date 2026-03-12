package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmailValidator {
    public static void main(String[] args) {
        Set<String> emails = new LinkedHashSet<>();
        emails.add("u1@gmail.com");
        emails.add("u2@gmail.com");
        emails.add("u3@gmail.com");
        emails.add("u2@gmail.com");
        emails.add("u4@gmail.com");
        emails.add("u5@gmail.com");
        emails.add("u6@gmail.com");
        System.out.println(emails.contains("u2@gmail.com"));
        emails.remove("u2@gmail.com");
        for(String email: emails){
            System.out.println(email);
        }

    }
}
