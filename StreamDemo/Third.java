package StreamDemo;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
class Employees{
    private Long id;
    private String name;
    private boolean isActive;
    private String department;
    private int salary;
    private int age;
    public Employees(Long id, String name, boolean isActive, String department, int salary, int age){
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.salary = salary;
        this.department = department;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public boolean isActive() {
        return isActive;
    }
    public Long getId() {
        return id;
    }
    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
public class Third {
    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,2,1,1);
//        Set<Integer> set = nums.stream().collect(Collectors.toSet());
//        System.out.println(set);
    //collectors
//        List<String> names = Arrays.asList("arish", "anish", "manish");
//        List<String> data =  names.stream().filter( name-> name.startsWith("a")).toList();
//        System.out.println(data);
//        ArrayDeque<String> collect = namesstream().collect(Collectors.toCollection(()-> new ArrayDeque<>()));
//        System.out.println(collect);
        //sumarrizing data
//        List<Integer> numbersData = Arrays.asList(1,2,3,4,5,6);
//        List<String> names = Arrays.asList("ram", "heraaa", "rabindraaa", "satwikkk");
//        System.out.println(names.stream().map(String::toUpperCase).filter(name->name.length()>4).toList());
        List<Employees> employeeList = new ArrayList<>();
        employeeList.add(new Employees(1L, "anishaa", true, "IT", 90000,29));
        employeeList.add(new Employees(2L, "suman", false, "HR", 5000,89));
        employeeList.add(new Employees(3L, "roshan", true, "Finance", 5000,28));
        employeeList.add(new Employees(4L, "pratik", false, "IT", 21000,19));
        employeeList.add(new Employees(5L, "kiran", true, "Marketing", 60000,21));
        employeeList.add(new Employees(6L, "bikash", false, "Sales", 55000,90));
        employeeList.add(new Employees(7L, "nabin", true, "HR", 5000,89));
        employeeList.add(new Employees(8L, "arjun", true, "Finance", 91000,21));
        employeeList.add(new Employees(9L, "dipesh", false, "IT", 17000,22));
        employeeList.add(new Employees(10L, "santosh", true, "Sales", 72000,23));
        employeeList.add(new Employees(11L, "ramesh", false, "Marketing", 61000,25));
        employeeList.add(new Employees(12L, "suresh", true, "HR", 53000,21));
        //System.out.println(employeeList.stream().filter(name-> name.isActive()).map(Employees::getName).toList());
        //System.out.println(employeeList.stream().filter(department-> department.getSalary()>50000).map(Employees::getDepartment).toList());
//        System.out.println(employeeList.stream().filter(employees -> employees.getAge()>30).map(Employees::getName).toList());


    }
}
