package hw6.task4;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Ivanov P.S.", "01.01.2000", "Marketing", "reader777");
        reader1.showReaderInfo();

        reader1.takeBook(1);
        System.out.println();
        reader1.showReaderInfo();

        reader1.takeBook("Война и мир", "Старик и море");
        System.out.println();
        reader1.showReaderInfo();

        Book[] shelf = new Book[5];
        shelf[0] = new Book("Лев Толстой", "Анна Каренина");
        shelf[1] = new Book("Пауло Коэльо", "Алхимик");
        shelf[2] = new Book("Терри Пратчетт и Нил Гейман", "Благие знамения");
        shelf[3] = new Book("Фрэнсис Скотт Фицджеральд", "Великий Гэтсби");
        shelf[4] = new Book("Герберт Уэллс", "Война миров");
        reader1.takeBook(shelf[1], shelf[2], shelf[3]);
        System.out.println();
        reader1.showReaderInfo();

        reader1.returnBook(2);
        reader1.returnBook("Алхимик", "Великий Гэтсби");
        System.out.println();
        reader1.showReaderInfo();
    }
}
