class Notebook{
    String company;
    int pages;
    static String name;
    int amount;
    static{
        name = "TextBook";
        System.out.println("Constructor initialized");
    }
    public Notebook(String company){
        this.company = company;
        System.out.println("Constructor: " + company);
    }
    public void details(){
        System.out.println(company + ":" + name);
    }
}
public class Second{
    public static void main(String[] args) {
        // Class.forName("Notebook");
        Notebook n1 = new Notebook("Classmate");
        Notebook n2 = new Notebook("Sketch");
        n1.details();
        n1.amount = 100;
        n2.details();
        n2.amount = 104;
        Notebook.name = "Himalayan";
        n1.details();
        n2.details();
    }
}