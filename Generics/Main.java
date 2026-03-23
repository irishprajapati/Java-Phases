package Generics;

public class Main {
    static void main(String[] args) {
        Box<String> nameBox = new Box<>("Erish");//passed the value from constructor
        Box<Integer> ageBox = new Box<>(10);
        Box<Double> scoreBox = new Box<>(100.0);
        String name = nameBox.getValue();
        int age = ageBox.getValue();
        double score = scoreBox.getValue();
        System.out.println("Name: " + name + " Age of " + name+ ": " + age+ " Score: " + score);
    }
}
