package ConceptUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AgeVerifierException extends Exception{
    public AgeVerifierException(String message){
        super(message);
    }
}

public class Verification {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter your age: ");
            int ageVerify = Integer.parseInt(br.readLine());
            if(ageVerify <18){
                throw new AgeVerifierException("Not verified age");
            }else{
                System.out.println("Your age is verified: " + ageVerify);
            }
        } catch (AgeVerifierException  e) {
            throw new RuntimeException(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Age verification attempt");
        }
    }
}
