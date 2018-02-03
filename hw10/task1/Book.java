package hw10.task1;

public class Book implements Printable {
    private final String type = "Book";
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.printf("\n%s \n\tTitle:%s", getType(), getTitle());
    }
}
