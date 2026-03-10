package ConceptUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/*first make the class
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
then ask the user for 2 number inputs
add and store in int
then check the exception - in built exception
*/
public class Sum {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Input first number: ");
            int num1 = Integer.parseInt(br.readLine());
            System.out.println("Input second number: ");
            int num2 = Integer.parseInt(br.readLine());
            int total = num1 + num2;
            System.out.println("Sum: " + total);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Checked the two numbers sum with handled exception");
        }

    }
}
