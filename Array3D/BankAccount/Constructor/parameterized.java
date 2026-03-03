package BankAccount.Constructor;
class Book{
    String title;
    int pages;
    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
}
public class parameterized {
    public static void main(String[] args) {
        Book data = new Book("Java", 100);
        System.out.println("The book name is: "+ data.title);
        System.out.println("It contains: "+ data.pages + " pages");
    }
}
