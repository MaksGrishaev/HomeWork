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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
