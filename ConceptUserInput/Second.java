package ConceptUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {

    public static void main(String[] args) {
        int num = 0;
        BufferedReader br = null;
        try(BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));){

            num = Integer.parseInt(br.readLine());
            System.out.println(num);}
    }
}