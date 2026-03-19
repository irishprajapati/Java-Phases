package Advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AnonymousUser implements Comparable<AnonymousUser>{
    private int rollNo;
    private String name;
    public AnonymousUser(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
    @Override
    public int compareTo(AnonymousUser that){
          return Integer.compare(this.rollNo, that.rollNo);
//        if(this.getRollNo() > that.getRollNo()){
//            return 1;
//        } else if (this.getRollNo()<that.getRollNo()) {
//            return -1;
//        }else{
//            return 0;
//        }
    }

    @Override
    public String toString() {
        return "AnonymousUser{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Employee{
    public static void main(String[] args) {
        List<AnonymousUser> data = new ArrayList<>();
        data.add(new AnonymousUser(3, "ramayan"));
        data.add(new AnonymousUser(2, "samyam"));
        data.add(new AnonymousUser(1, "hariprasad"));
        data.add(new AnonymousUser(6, "shivam"));
        Collections.sort(data);
        for(AnonymousUser d: data){
            System.out.println(d);
        }
    }
}