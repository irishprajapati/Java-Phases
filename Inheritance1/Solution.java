package Inheritance1;

class Employee{
    String name;
    double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public void calculateSalary(){
        System.out.println("Base salary: " + salary);
    }
}
public class Solution {
    public static void main(String[] args) {
        
    }
}
