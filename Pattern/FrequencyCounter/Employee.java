package Pattern.FrequencyCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class EmployeeService{
    String name;
    String department;
    //salary is not declared as final because the salary can be increment
    private int salary;
    public EmployeeService(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public int getSalary(){ //getter method
        return salary;
    }
    @Override
    public String toString(){
        return "Name: " + name + "  Department: " + department+ "Salary: " + getSalary();
    }
}

public class Employee {
    public static void main(String[] args) {
        List<EmployeeService> employees  = new ArrayList<>();
        employees.add(new EmployeeService("Erish", "IT",100000));
        employees.add(new EmployeeService("Anish", "HR",20000));
        employees.add(new EmployeeService("Prithivi", "HR",40000));
        employees.add(new EmployeeService("Salin", "IT",90000));
        employees.add(new EmployeeService("Sarthak", "IT",80000));
//        System.out.println(employees.get(1));
        for(EmployeeService employee: employees){
            System.out.println(employee);
        }
        Map<String, Integer> departmentCount = new HashMap<>();
        for(EmployeeService emp: employees){
            departmentCount.put(emp.department, departmentCount.getOrDefault(emp.department,0)+ 1);

        }
        System.out.println(departmentCount);
    }
}
