package hw5.task1;

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

        double[] dblMas = {34.5d, 0.111111d, 34545.3453453d, 56.67d};
        System.out.println("2) dblMas[" + 0 + "] = " + dblMas[0]);
    }
}
