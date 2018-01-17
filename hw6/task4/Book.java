package hw6.task4;

public class Book {
    private String author;
    private String title;

    Book(String author, String title) {
        setAuthor(author);
        setTitle(title);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void showBookInfo() {
        System.out.print("\tАвтор книги:\t");
        System.out.println(getAuthor());
        System.out.print("\tНазвание книги:\t");
        System.out.println(getTitle());
    }
}
