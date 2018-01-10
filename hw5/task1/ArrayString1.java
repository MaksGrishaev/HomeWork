package hw5.task1;
/*
1)Создать массив типа String с размером 7. Записать в него значения дней недели.
Вывести на консоль значение последнего элемента. (Задание с урока).
2)Создать массив типа double с размером 4. Записать в него любые значения с помощью блока для инициализации.
Вывести на консоль значение первого элемента. (Задание с урока).
*/

public class ArrayString1 {
    public static void main(String[] args) {
        String[] masStr = new String[7];
        masStr[0] = "ПН";
        masStr[1] = "ВТ";
        masStr[2] = "СР";
        masStr[3] = "ЧТ";
        masStr[4] = "ПТ";
        masStr[5] = "СБ";
        masStr[6] = "ВС";
        System.out.println("1) masStr[" + (masStr.length - 1) + "] = " + masStr[masStr.length - 1]);

        double[] dblMas = {34.5d,0.111111d,34545.3453453d,56.67d};
        System.out.println("2) dblMas[" + (0) + "] = " + dblMas[0]);
    }
}
