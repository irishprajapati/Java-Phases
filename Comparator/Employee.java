package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class EmployeeList {
    private int id;
    private String name;
    private double salary;
    private String department;
    public static final Comparator<EmployeeList> by_id = Comparator.comparingInt(EmployeeList::getId);
    public static final Comparator<EmployeeList> by_name = Comparator.comparing(EmployeeList::getName);
    public static final Comparator<EmployeeList> by_salary_desc = Comparator.comparingDouble(EmployeeList::getSalary).reversed();
    public static final Comparator<EmployeeList> by_department = Comparator.comparing(EmployeeList::getDepartment);

    public EmployeeList(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "EmployeeList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
public class Employee {
    public static void main(String[] args) {
        List<EmployeeList> employees = new ArrayList<>();
        employees.add(new EmployeeList(1, "satwik", 19000.99, "Sales"));
        employees.add(new EmployeeList(2, "anuska", 90000, "Traffic"));
        employees.add(new EmployeeList(3, "hari", 100000, "IT"));
        employees.sort(EmployeeList.by_id);
//        employees.sort(EmployeeList.by_salary_desc);
        for(EmployeeList e: employees){
            System.out.println(e);
        }

    }

}
