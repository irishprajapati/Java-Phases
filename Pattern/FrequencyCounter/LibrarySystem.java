package Pattern.FrequencyCounter;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Book{
    private int id;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;
    public Book(int id, String title, String author, String genre, boolean isAvailable){
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }
    public int getId(){return id;}
    public String getTitle(){return  title;}
    public String getAuthor(){return author;}
    public String getGenre(){return genre;}

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    @Override
    public String toString(){
        return "ID: " + getId() + " Title of Book: " + getTitle() + " Author of Book: " + getAuthor() + " Genre of Book: " + getGenre() + " Available: " + isAvailable();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
class Member{
    private int id;
    private String name;
    private String email;
    public Member(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public String getEmail(){return email;}
    @Override
    public String toString(){
        return "Member Details | MemberID: " + getId() + " Name: " + getName() + " Email: " + getEmail();
    }
    @Override
    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id == member.id;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
interface LibraryRepository{
    void addBook(Book b);
    void addMember(Member m);
    void borrowBook(int bookId, int memberId);
    void returnBook(int bookId, int memberId);
    List<Book> getAllBooks();
    List<Book> getAvailableBooks();
}
class LibraryRegistry implements LibraryRepository{
    private Map<Integer, Book> bookmap = new ConcurrentHashMap<>();
    private Map<Integer, Member> memberMap = new ConcurrentHashMap<>();
    private Map<Integer, List<Integer>> borrowedBooks = new ConcurrentHashMap<>();
    public void addBook(Book b){
        if(bookmap.containsKey(b.getId())){
            System.out.println("Book already exists in library");
        }else{
            bookmap.put(b.getId(), b);
        }
    }
    public void addMember(Member m){
        if(memberMap.containsKey(m.getId())){
            System.out.println("member already exists in library");
        }else{
            memberMap.put(m.getId(),m);
        }
    }
    public void borrowBook(int bookId, int memberId){
        if(!bookmap.containsKey(bookId)){
            System.out.println("Book not found in library");
            return;
        }else if(!memberMap.containsKey(memberId)){
            System.out.println("Member not found");
            return;
        }
        Book book = bookmap.get(bookId);
        if(!book.isAvailable()){
            System.out.println("book already borrowed");
            return;
        }
        book.setAvailable(false);
        borrowedBooks.computeIfAbsent(memberId, k-> new ArrayList<>()).add(bookId);
        System.out.println("Book borrowed by member: " + memberId);
    }
    public void returnBook(int bookId, int memberId){
        if(!bookmap.containsKey(bookId)){
            System.out.println("Book not found");
            return;
        } else if (!memberMap.containsKey(memberId)) {
            System.out.println("Member not founnd");
            return;
        }
        List<Integer> borrowed = borrowedBooks.get(memberId);
        if(borrowed == null || !borrowed.contains(bookId)){
            System.out.println("This member didn't borrowed the book");
            return;
        }
        Book book = bookmap.get(bookId);
        book.setAvailable(true);
        borrowed.remove(Integer.valueOf(bookId));
    }
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookmap.values());
    }

    public List<Book> getAvailableBooks(){
        List<Book> available = new ArrayList<>();
        for (Book book : bookmap.values()) {
            if (book.isAvailable()) {
                available.add(book);
            }
        }
        return available;
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryRegistry registry = new LibraryRegistry();
        Book b1 = new Book(1, "Scala Programming", "Martin Odersky", "Technical", true);
        Book b2 = new Book(2, "Clean Code", "Robert C. Martin", "Programming", true);
        Book b3 = new Book(3, "Effective Java", "Joshua Bloch", "Programming", true);
        Book b4 = new Book(4, "Design Patterns", "Erich Gamma", "Software Engineering", false);
        Book b5 = new Book(5, "Introduction to Algorithms", "Thomas H. Cormen", "Computer Science", true);
        registry.getAvailableBooks();
        registry.addBook(b1);
        registry.addBook(b2);
        registry.addBook(b3);
        registry.addBook(b4);
        registry.addBook(b5);
        Member member = new Member(1,"James thapa", "jm@gmail.com");
        System.out.println("Member: " + member.toString());
        registry.addMember(member);
        registry.borrowBook(1,1);
        System.out.println("-- Available after borrowing --");
        for (Book b : registry.getAvailableBooks()) System.out.println(b);
        registry.returnBook(1,1);
        System.out.println("-- Available after returning --");
        for (Book b : registry.getAvailableBooks()) System.out.println(b);
        for(Book book: registry.getAllBooks()){
            System.out.println(book);
        }
        for(Book book : registry.getAvailableBooks()){
            System.out.println(book);
        }
    }
}
