package Claude;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    private Long id;
    private String name;
    private String department;
    private double salary;
    public Employee(Long id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class FirstMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L,"steve", "IT",1000));
        employees.add(new Employee(2L, "sam", "Sales",20000));
        employees.add(new Employee(3L, "shriya", "Design",30000));
        employees.add(new Employee(4L,"Samantha", "HR",50000));
        employees.add(new Employee(5L,"anish", "IT",70000));
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getDepartment).thenComparingDouble(Employee::getSalary).reversed();
        employees.sort(employeeComparator);
        for(Employee e: employees){
            System.out.println(e);
        }
    }
}
