package Casting;
abstract class Report{
    public final void generateReport(){
        //template method(final so subclass cant override the design)
        fetchData();
        formatData();
        printReport();
    }
    abstract void fetchData();
    abstract void formatData();
    public void printReport(){
        System.out.println("Printing report");
    }
}
class PDFReport extends Report{
    @Override
    void fetchData(){
        System.out.println("fetching PDF data...");
    }
    @Override
    void formatData(){
        System.out.println("formating PDF data..");
    }
}
class ExcelReport extends PDFReport{
    @Override
    void fetchData(){
        System.out.println("Fetching excel data...");
    }
    @Override
    void formatData(){
        System.out.println("formating excel data...");
    }
}
public class reportFormat {
    public static void main(String[] args) {
        Report r1 = new PDFReport();
        r1.generateReport();
    }
    
}
