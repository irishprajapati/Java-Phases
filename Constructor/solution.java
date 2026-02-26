package Constructor;
class Book{
    String title;
    int pages;
    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
}
public class solution {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 11);
        System.out.println(b1.title);
    System.out.println(b1.pages);    }
    
}
