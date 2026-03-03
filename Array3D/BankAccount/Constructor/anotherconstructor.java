package BankAccount.Constructor;
//college fee
//private name semester fee 
//override ani reset if someone pending bill is there

class Semester{
    private String name;
    private int semester;
    private int dueAmount;

    void showDetails(){
        System.out.println("Student name: "+ name + " Semester " + semester + " Due amount: " + dueAmount);
    }
    public Semester(String name, int semester, int dueAmount){
        if(name == null || semester<=0){
            throw new IllegalArgumentException("Details can not be null");
        }
        
        this.name = name;
        this.semester = semester;
        this.dueAmount = dueAmount;
    }
    //getter method
    public String getName(){
        return name;
    }
    public int getSemester(){
        return semester;
    }
    public int getDueAmount(){
        return dueAmount;
    }
    //setter method
    public void setName(String name){
        this.name = name;
    }
    public void setSemester(int semester){
        this.semester = semester;
    }
    public void setDueAmount(int dueAmount){
        this.dueAmount = dueAmount;
    }

}
public class anotherconstructor {
    public static void main(String[] args) {
        Semester student1 = new Semester("Erish", 7, 90000);
        Semester student2 = new Semester("Anish", 8, 0);
        student1.showDetails();
        student2.showDetails();
    }
}
