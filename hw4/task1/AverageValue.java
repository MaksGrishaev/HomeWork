package hw4.task1;

public class AverageValue {
    public static void main(String[] args) {
        int count = args.length;
        double summa = 0.0;
        for (String str : args) {
            summa += Double.parseDouble(str);
        }
        System.out.println(summa / count);
    }
}
