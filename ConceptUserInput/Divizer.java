package ConceptUserInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Divizer {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter divisible number: ");
            int num1 = Integer.parseInt(br.readLine());
            System.out.println("Enter dividing number: ");
            int num2 = Integer.parseInt(br.readLine());
            int result = num1  / num2; //operation happens here
            System.out.println("Output number: " + result);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e) { //parent class
            System.out.println("Something went wrong");;
        }finally {
            System.out.println("Attempt of divide opearation");
        }
    }
}
