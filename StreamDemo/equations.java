package StreamDemo;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
private String name;
private String department;
private int salary;
private boolean active;
public Employee(String name, String department, int salary, boolean active){
    this.name = name;
    this.department = department;
    this.salary = salary;
    this.active = active;
}

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isActive() {
        return active;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", active=" + active +
                '}';
    }
}
public class equations {
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee("Anish", "IT", 10000, false));
        employees.add(new Employee("Sara", "HR", 55000, true));
        employees.add(new Employee("Rajan", "Finance", 72000, true));
        employees.add(new Employee("Priya", "IT", 48000, true));
        employees.add(new Employee("Tom", "Marketing", 61000, false));
        employees.add(new Employee("Nisha", "Engineering", 95000, true));
        employees.add(new Employee("Dev", "IT", 43000, true));
        employees.add(new Employee("Lena", "HR", 52000, false));
        employees.add(new Employee("Marco", "Finance", 68000, true));
        employees.add(new Employee("Aisha", "Engineering", 87000, true));
        employees.add(new Employee("Kiran", "Marketing", 59000, false));
        employees.add(new Employee("Felix", "IT", 41000, true));
        employees.add(new Employee("Zara", "Engineering", 91000, true));
        employees.add(new Employee("Rohan", "Finance", 77000, false));
        employees.add(new Employee("Mei", "HR", 50000, true));
        employees.add(new Employee("Carlos", "Marketing", 63000, true));
        employees.add(new Employee("Puja", "IT", 46000, false));
        employees.add(new Employee("Henrik", "Engineering", 83000, true));
        employees.add(new Employee("Divya", "Finance", 71000, false));
        employees.add(new Employee("Owen", "Marketing", 57000, false));
        List<String> activeNames = employees.stream().filter(Employee::isActive).map(Employee::getName).toList();
//        System.out.println(activeNames);
        //salary of active employees

        int totalSalary = employees.stream().filter(Employee::isActive).mapToInt(Employee::getSalary).sum();
//        System.out.println(totalSalary);
        //grouping active employess by department
//        Map<String, List<Employee>> activeByDept = employees.stream().filter(Employee:: isActive).collect(Collectors.groupingBy(Employee::getDepartment));
//        for(Map.Entry<String, List<Employee>> entry: activeByDept.entrySet()){
//            System.out.println("Department: " + entry.getKey());
//            for(Employee e: entry.getValue()){
//                System.out.println(e.getName());
//            }
//        }
//        System.out.println(activeByDept);
        //count employees per department
//        Map<String, Long> countByDept = employees.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.counting()));
//        System.out.println(countByDept);
        Optional<Employee> highestPaid = employees.stream().filter(Employee:: isActive).max(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println(highestPaid);
    }
}
