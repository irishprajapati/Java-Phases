package Constructor;

// Book class
class Book {
    private String title;
    private int pages;

    // Default constructor
    public Book() {
        System.out.println("Constructor called");
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

// Main class
public class questionone {
    public static void main(String[] args) {
        Book b1 = new Book();  // calls constructor
        b1.setTitle("Data");
        b1.setPages(100);

        // Print values
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Pages: " + b1.getPages());
    }
}