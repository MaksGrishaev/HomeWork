package hw7.task2;

public class Univer {
    public static void main(String[] args) {
        Student[] arrSt = new Student[3];
        arrSt[0] = new Student("Ivanov", "Ivan", "KIU", 4);
        arrSt[1] = new Aspirant("Petrov", "Petr", "KIU", 5, "WORK");
        arrSt[2] = new Student("Sidorov", "Sidr", "KIU", 5);

        for (Student st : arrSt) {
            System.out.print(st.toString());
            System.out.println("\tРазмер степендии: " + st.getScholarship() + "грн.");
        }
    }
}
