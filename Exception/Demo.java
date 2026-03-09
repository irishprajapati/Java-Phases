package Exception;

public class Demo {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 0;
        int nums [] = new int [5];
        String str = null;

        try{ 
            num2 = 18/num1; //dividing by 4
            // System.out.println(nums[1]);//fetching the second element //this can print the value of nums[1] as 0
            System.out.println(str.length());
            System.out.println(nums[5]);// this can throw an exception as array index are started at 0
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero"  );
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array limit reached");
        }
        catch(Exception e){
            System.out.println("Something went wrong" + e);
        }
        System.out.println(num2);//this prints the 9 then
    }
}
