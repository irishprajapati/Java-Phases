package Pattern;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    //constructor
    public Employee(int id, String name, String department, double salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    //getter
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
    @Override //default java method that is overriden to print the objects properly
    public String toString(){
        return "Id: " + getID() + " Name: " + getName() + " Department: " + getDepartment() + " Salary: " + getSalary();
    }
    @Override //checking the difference between == and equals
    public boolean equals(Object obj){
        if(obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return this.id == employee.id;
    }
    @Override //checking bucket memory allocation
    public int hashCode(){
        return Integer.hashCode(this.id);
    }
    //methods to call for fetching the details
    public String getDetails(){
        return "Employee | Id: " + getID() + " | Name: " + getName() + " | Department: " + getDepartment() + "| Salary: " + getSalary();
    }
}
//child class(inheritance) of Employee
class Manager extends Employee{
    List<Employee> teamMembers = new ArrayList<>();

    public Manager(int id, String name, String department, double salary) {
        super(id, name, department, salary);
    }
    public synchronized void addTeamMembers(Employee e){
        if(teamMembers.contains(e)){
            System.out.println("Employee already exists in the system");
        }else{
            teamMembers.add(e);
        }
    }
    public List<Employee> getTeamMembers(){
        return teamMembers;
    }
    @Override
    public String getDetails(){
        return "Manager | Id: " + getID() + " | Name: " + getName() + " | Department: " + getDepartment() + "| Salary: " + getSalary() + " | TeamSize: " + teamMembers.size();
    }
}

class Intern extends Employee{
    private int durationMonths;

    Intern(int id,String name,String department, double salary, int durationMonths) {
        super(id, name, department,salary);
        this.durationMonths = durationMonths;
    }
    public int getDurationMonths(){
        return durationMonths;
    }
    @Override
    public String getDetails(){
        return "Intern | Id: " + getID() + " | Name: " + getName() + " | Department: " + getDepartment() + "| Salary: " + getSalary() + " | Duration: " + getDurationMonths() + " Months";
    }
}
interface EmployeeRepository{
    void addEmployee(Employee e);
    void removeEmployee(int id);
    Employee getEmployee(int id);
    List<Employee> getAllEmployees();
}
class EmployeeRegistry implements EmployeeRepository {
    private Map<Integer, Employee> employeeMap = new ConcurrentHashMap<>();
    @Override
    public synchronized void addEmployee(Employee e) {
        if (employeeMap.containsKey(e.getID())) {
            System.out.println("Employee alaready exists");
        } else {
            employeeMap.put(e.getID(), e);
        }
    }

    @Override
    public void removeEmployee(int id) {
        if(employeeMap.containsKey(id)){
            employeeMap.remove(id);
        }else{
            System.out.println("Employee not found");
        }
    }
    @Override
    public Employee getEmployee(int id){
        if(employeeMap.containsKey(id)) {
            return employeeMap.get(id);

        }else{
            System.out.println("employee not found");
            return null;
        }
    }

    public List<Employee> getAllEmployees(){
        return new ArrayList<>(employeeMap.values());
    }
}

public class EmployeeService {
    public static void main(String[] args) throws InterruptedException {
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

//        System.out.println(registry.getEmployee(13));
//        registry.removeEmployee(16);
//        for(Employee emp: registry.getALlEmployees()){
//            System.out.println(emp);
//        }
        Manager manager = new Manager(1,"bibek","Marketing",90000);
        manager.addTeamMembers(new Employee(2, "Sujan Karki", "Marketing", 65200.50));
        manager.addTeamMembers(new Employee(3, "Nabin Khadka", "IT", 120500.90));
        manager.addTeamMembers(new Employee(4, "Bikash Gurung", "Human Resources", 57320.00));
        manager.addTeamMembers(new Employee(5, "Prakash Bhandari", "Operations", 73410.40));
        manager.addTeamMembers(new Employee(6, "Sita Sharma", "Finance", 68000.00));
        manager.addTeamMembers(new Employee(7, "Ramesh Thapa", "IT", 85000.00));
        manager.addTeamMembers(new Employee(8, "Anita Rai", "Marketing", 61000.00));
        manager.addTeamMembers(new Employee(9, "Deepak Magar", "Operations", 70000.00));
        manager.addTeamMembers(new Employee(10, "Priya Shrestha", "HR", 55000.00));
        manager.addTeamMembers(new Employee(11, "Rohan Poudel", "Finance", 72000.00));
//        System.out.println(manager.teamMembers);
//        System.out.println(manager.getDetails());
//        System.out.println(manager.getTeamMembers());

        Intern intern = new Intern(20, "Sujan Karki", "Marketing", 65200.50, 2);
//        System.out.println(intern.getDetails());
        List<Employee> allStaff = new ArrayList<>();
        allStaff.add(e1);
        allStaff.add(manager);
        allStaff.add(intern);
        for(Employee emp: allStaff){
            System.out.println(emp.getDetails());
        }
        EmployeeRegistry registry2 = new EmployeeRegistry();
        Runnable task1 = () ->{
            for(int i = 0; i<10; i++){
                registry2.addEmployee(new Employee(i, "Samrat" + i, "IT", 90000));
            }
        };
        Runnable task2 = () ->{
            for(int i = 0; i<10; i++){
                registry2.addEmployee(new Employee(i, "Samrat" + i, "IT", 90000));

            }
        };
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Total Employees: " + registry2.getAllEmployees().size());
    }
}

