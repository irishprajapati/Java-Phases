package DebugPractice;

public class DiscountCalculator {
    public static void main(String[] args) {
        int price = 1200;
        if(price >1000){
            price = price - (price * 10/100);
        }
        else{
            price = price - (price * 5)/100;
        }
        System.out.println("Final Price: "+ price);
    }
}
