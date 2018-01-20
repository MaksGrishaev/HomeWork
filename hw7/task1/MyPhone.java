package hw7.task1;

import java.util.Scanner;

public class MyPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("123456");
        Phone phone3 = new Phone("Alis", "777", "lenovo");
        Phone phone4 = new Phone(inputDataString("имя"), inputDataString("номер"), inputDataString("модель"), 111);
        phone1.showInfo();
        phone2.showInfo();
        phone3.showInfo();
        phone4.showInfo();
        phone3.receiveCall(phone2.getName());
        phone2.receiveCall(phone3.getName(), phone3.getNumber());
        phone4.sendMessage(phone2.getNumber(), phone3.getNumber());

        System.out.println("Количество номеров: " + Phone.getCount());
    }

    public static String inputDataString(String infoType) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите " + infoType + ": ");
        return sc.next();
    }
}
