package Claude;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Book implements  Comparable<Book>{
    private String title;
    private int pages;
    //constructor initialization
    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
    //getter method

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.getPages(), other.getPages());
    }
}
public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Basics", 300));
        books.add(new Book("Spring guide", 450));
        books.add(new Book("DSA", 250));
       /* books.sort(Book::compareTo);
        for(Book data: books){
             System.out.println(data);
        }
        */
        Comparator<Book> bookComparator = Comparator.comparing(Book::getTitle);
        books.sort(bookComparator);
        for(Book data: books){
            System.out.println(data);
        }
    }
}
