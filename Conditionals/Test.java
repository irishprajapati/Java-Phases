// Conditions:
// Print "Positive" if > 0
// Print "Negative" if < 0
// Print "Zero" otherwise

//lets make a class
class Test{
    //lets make main method inside a class
    public static void main(String[] args) {
        //lets define now what the problem says
        int number = 10;
        if(number>0){ //check if the number is greater than 0
            System.out.println("Positive");//if yes then execute this line
        } else if(number<0){//otherwise check this line if the give number is less than 0
            System.out.println("Negative");//if the number is lesser than 0 then print this line
        }else{
            System.out.println("Zero");//otherwise execute this line
        }
    }
}