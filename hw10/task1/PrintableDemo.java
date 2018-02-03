package hw10.task1;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] publications = new Printable[10];
        publications[0] = new Book("book1title");
        publications[1] = new Book("book2title");
        publications[2] = new Book("book3title");
        publications[3] = new Book("book4title");
        publications[4] = new Magazine("magaz1title");
        publications[5] = new Magazine("magaz2title");
        publications[6] = new Book("book5title");
        publications[7] = new Magazine("magaz3title");
        publications[8] = new Magazine("magaz4title");
        publications[9] = new Magazine("magaz5title");

        for (Printable prnt : publications) {
            prnt.print();
        }
        System.out.println("\n\n--printMagazines()-----------");
        Magazine.printMagazines(publications);
    }
}
