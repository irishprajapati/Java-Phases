package Claude;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Staff{
    private Long id;
    private String name;
    private String department;
    public Staff(Long id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
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

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
public class StaffData {
    public static void main(String[] args) {
        List<Staff> staffList = new ArrayList<>();
        staffList.add(new Staff(1L, "Anisha", "IT"));
        staffList.add(new Staff(2L, "Ravi", "HR"));
        staffList.add(new Staff(3L, "Sita", "Finance"));
        staffList.add(new Staff(4L, "Anisha", "HR"));      // same name, different department
        staffList.add(new Staff(5L, "Kiran", "IT"));       // same department
        staffList.add(new Staff(6L, "Ravi", "Finance"));   // same name, different department
        staffList.add(new Staff(7L, "Maya", "IT"));        // same department
        Comparator<Staff> staffComparator = Comparator.comparing(Staff::getDepartment).thenComparing(Staff::getName).thenComparingLong(Staff::getId);
        staffList.sort(staffComparator);
        for(Staff data: staffList){
            System.out.println(data);
        }
    }
}
