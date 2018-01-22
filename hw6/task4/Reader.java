package hw6.task4;

import java.util.Scanner;

public class Reader {
    private String fio;
    private String numTiket;
    private String faculty;
    private String dateOfBirth;
    private int countBooks;
    private Book[] receivedBooks;

    public Reader(String fio, String dateOfBirth, String faculty, String numTiket) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.faculty = faculty;
        this.numTiket = numTiket;
        countBooks = 0;
        receivedBooks = null;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setNumTiket(String numTiket) {
        this.numTiket = numTiket;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String inputStringData(String data) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите " + data + ":");
        return sc.nextLine();
    }

    public void takeBook(int amountBooks) {
        if (amountBooks == 0) {
            return;
        }
        Book[] newBooks = new Book[countBooks + amountBooks];
        if (countBooks > 0) {
            for (int i = 0; i < countBooks; i++) {
                newBooks[i] = receivedBooks[i];
            }
        }
        for (int i = countBooks; i < countBooks + amountBooks; i++) {
            newBooks[i] = new Book("Неизвестен", "Неизвестно");
        }
        countBooks += amountBooks;
        receivedBooks = newBooks;
    }

    public void takeBook(String... titles) {
        if (titles.length == 0) {
            return;
        }
        Book[] newBooks = new Book[countBooks + titles.length];
        if (countBooks > 0) {
            for (int i = 0; i < countBooks; i++) {
                newBooks[i] = receivedBooks[i];
            }
        }
        int i = countBooks;
        for (String title : titles) {
            newBooks[i] = new Book("Неизвестен", title);
            i++;
        }
        countBooks += titles.length;
        receivedBooks = newBooks;
    }

    public void takeBook(Book... books) {
        if (books.length == 0) {
            return;
        }
        Book[] newBooks = new Book[countBooks + books.length];
        if (countBooks > 0) {
            for (int i = 0; i < countBooks; i++) {
                newBooks[i] = receivedBooks[i];
            }
        }
        int i = countBooks;
        for (Book newBook : books) {
            newBooks[i] = new Book(newBook.getAuthor(), newBook.getTitle());
            i++;
        }
        countBooks += books.length;
        receivedBooks = newBooks;
    }

    public void returnBook(int amount) {
        if (countBooks == 0) {
            System.out.println("нет книг для возврата");
        } else if (countBooks <= amount) {
            countBooks = 0;
            receivedBooks = null;
        } else {
            countBooks -= amount;
            for (int i = 0; i < amount; i++) {
                for (int j = 1; j < receivedBooks.length; j++) {
                    receivedBooks[j - 1] = receivedBooks[j];
                }
                receivedBooks[receivedBooks.length - 1 - i] = null;
            }
        }
    }

    public void returnBook(String... titles) {
        if (titles == null) {
            return;
        }
        for (String title : titles) {
            for (int i = 0; i < countBooks; i++) {
                if (receivedBooks[i].getTitle() == title) {
                    for (int n = i; n < countBooks - 1; n++) {
                        receivedBooks[n] = receivedBooks[n + 1];
                    }
                    receivedBooks[countBooks - 1] = null;
                    countBooks--;
                }
            }
        }
        clrNullElement();
    }

    private void clrNullElement() {
        if (countBooks == 0) {
            receivedBooks = null;
            return;
        }
        Book[] newBooks = new Book[countBooks];
        for (int i = 0; i < countBooks; i++) {
            newBooks[i] = receivedBooks[i];
        }
        receivedBooks = newBooks;
    }

    public void showReaderInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Дата рождения: " + dateOfBirth);
        System.out.println("Факультет: " + faculty);
        System.out.println("Читательский билет: № " + numTiket);
        if (countBooks == 0) {
            System.out.println("Книг на руках нет");
        } else {
            int i = 1;
            System.out.println("Книги на руках:");
            for (Book book : receivedBooks) {
                System.out.print(i + ". ");
                book.showBookInfo();
                i++;
            }
        }
    }
}
