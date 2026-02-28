package Inheritance1;

public class Developer extends Employee{
    private double bonus;
    public Developer(String name, double salary, double bonus){
        super(name,salary);
        this.bonus = bonus;

    }
    @Override
    public void calculateSalary(){
        double total = salary + bonus;
        System.out.println("Developer salary: "+ total);
    }
}
