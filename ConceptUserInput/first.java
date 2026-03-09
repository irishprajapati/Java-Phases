package ConceptUserInput;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class first {
    static void main(String[] args) {
        System.out.println("Enter a number bitch: ");
        try{
//            InputStreamReader obj = new InputStreamReader(System.in);
//            BufferedReader data1 = new BufferedReader(obj);
            Scanner sc = new Scanner(System.in);
           int num =  sc.nextInt();
            System.out.println(num);
            sc.close();
//           System.out.println(num -48); //-48 to reduce the asci value
        } finally {
            System.out.println("Buffered User stream input");
        }

    }
}
