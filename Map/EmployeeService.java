package Map;

import java.util.HashMap;
import java.util.Map;

class Employee{
    String name;
    String department;
    double salary;
    public Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return name + " | " + department + " | Rs" + salary;
    }
}

public class EmployeeService {
    public static void main(String[] args) {
        Map<Integer, Employee> employees = new HashMap<>();
        employees.put(1011, new Employee("Erish", "IT", 290000));
        employees.put(1012, new Employee("Anish", "IT", 390000));
        employees.put(1013, new Employee("Satwik", "Marketing", 190000));
        employees.put(1014, new Employee("Samyam", "Sales", 291000));
        employees.put(1015, new Employee("Satah", "Graphic designing", 200000));


        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }
        Map<String, Integer> departmentCount = new HashMap<>();

        for(Employee emp : employees.values()){
            departmentCount.put(emp.department,
                    departmentCount.getOrDefault(emp.department, 0) + 1);
        }

        System.out.println(departmentCount);
    }
}
