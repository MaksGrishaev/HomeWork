package hw4.task4;

public class WeekDayIF {
    public static void main(String[] args) {
        String str = args.length > 0 ? args[0] : "1";
        if ("1".equals(str)) {
            System.out.println("ПН");
        } else if ("2".equals(str)) {
            System.out.println("ВТ");
        } else if ("3".equals(str)) {
            System.out.println("СР");
        } else if ("4".equals(str)) {
            System.out.println("ЧТ");
        } else if ("5".equals(str)) {
            System.out.println("ПТН");
        } else if ("6".equals(str) || "7".equals(str)) {
            System.out.println("ВЫХОДНОЙ");
        } else {
            System.out.println("error");
        }
    }
}
