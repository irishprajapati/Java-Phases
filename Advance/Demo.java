package Advance;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Comparator comp = new Comparator<Integer>(){
            public int compare(Integer i, Integer k){
                if(i%10>k%10)
                    return 1;
                else if(i%10 < k%10)
                    return -1;
                else
                    return 0;
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(21);
        nums.add(12);
        nums.add(33);
        nums.add(29);
        nums.add(51);
        Collections.sort(nums,comp);
        System.out.println(nums);
    }
}
