package Digest;

import java.util.ArrayList;

public class Wildcards{
     public static void main(String[] args) {

    }
    public <T> void copy(ArrayList<T> source, ArrayList<T> destination){
         for(T item: source){
             destination.add(item);
         }
    }
//    //wildcard using ? instead of <T>
//    public <T>  T getFirst(ArrayList <T> list){
//         return list.get(0);
//    }

}