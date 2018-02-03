package hw10.task1;

public class Magazine implements Printable {
    private final String type = "Magazine";
    private String title;

    public Magazine(String title) {
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


    public static void printMagazines(Printable[] printable) {
        for (Printable prnt : printable) {
            if (prnt instanceof Magazine) {
                prnt.print();
            }
        }
    }
}
