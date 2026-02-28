package Inheritance1;

public class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    //method creation
    public void calculateSalary(){
        System.out.println("Base salary: "+ salary);
    }
}
