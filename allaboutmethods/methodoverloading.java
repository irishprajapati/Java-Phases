class Calculator{
    public int add(int num1, int num2){
        // int result = num1 + num2;
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;

    }
    }
public class methodoverloading{
    public static void main(String[] args) {
        Calculator data = new Calculator();
        int result1 = data.add(10, 20);
        System.out.println(result1);
    }
}