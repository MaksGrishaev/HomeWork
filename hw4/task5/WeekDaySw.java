package hw4.task5;

public class WeekDaySw {
    public static void main(String[] args) {
        String str = args.length > 0 ? args[0] : "1";
        switch (str) {
            case "1":
                System.out.println("ПН");
                break;
            case "2":
                System.out.println("ВТ");
                break;
            case "3":
                System.out.println("СР");
                break;
            case "4":
                System.out.println("ЧТ");
                break;
            case "5":
                System.out.println("ПТН");
                break;
            case "6":
            case "7":
                System.out.println("ВЫХОДНОЙ");
                break;
            default:
                System.out.println("error");
        }
    }
}
