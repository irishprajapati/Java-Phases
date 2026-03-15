package Pattern;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employee(int id, String name, String department, double salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public String toString(){
        return "Id: " + getID() + " Name: " + getName() + " Department: " + getDepartment() + " Salary: " + getSalary();
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return this.id == employee.id;
    }
    @Override
    public int hashCode(){
        return Integer.hashCode(this.id);
    }
}
class EmployeeRegistry {
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    public void addEmployee(Employee e) {
        if (employeeMap.containsKey(e.getID())) {
            System.out.println("Employee alaready exists");
        } else {
            employeeMap.put(e.getID(), e);
        }
    }

    public void removeEmployee(int id) {
        if(employeeMap.containsKey(id)){
            employeeMap.remove(id);
        }else{
            System.out.println("Employee not found");
        }
    }
    public Employee getEmployee(int id){
        if(employeeMap.containsKey(id)) {
            return employeeMap.get(id);

        }else{
            System.out.println("employee not found");
            return null;
        }
    }
    public List<Employee> getALlEmployees(){
        return new ArrayList<>(employeeMap.values());
    }
}

public class EmployeeService {
    public static void main(String[] args) {
        EmployeeRegistry registry = new EmployeeRegistry();
        Employee e1 = new Employee(13, "Sujan Karki", "Marketing", 65200.50);
        Employee e2 = new Employee(13, "Sujan", "Marketing", 65200.50);
        Employee e3 = new Employee(15, "Bikash Gurung", "Human Resources", 57320.00);
        Employee e4 = new Employee(16, "Nabin Khadka", "IT", 120500.90);
        Employee e5 = new Employee(17, "Prakash Bhandari", "Operations", 73410.40);
        registry.addEmployee(e1);
        registry.addEmployee(e2);
        registry.addEmployee(e3);
        registry.addEmployee(e4);
        registry.addEmployee(e5);

        System.out.println(registry.getEmployee(13));
        registry.removeEmployee(16);
        for(Employee emp: registry.getALlEmployees()){
            System.out.println(emp);
        }

    }
}

