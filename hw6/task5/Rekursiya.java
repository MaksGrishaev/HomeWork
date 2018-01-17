package hw6.task5;

public class Rekursiya {
    public static void main(String[] args) {
        System.out.println(intFromA2B(4, 10));
        System.out.println(intFromA2B(4, -10));
    }

    public static String intFromA2B(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + intFromA2B(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + intFromA2B(a + 1, b);
        }
    }
}
