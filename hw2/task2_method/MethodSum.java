package hw2.task2_method;

public class MethodSum {
    public static void main(String[] args) {
        int var1 = 07654;   //4012
        int var2 = 0b10101; //21
        System.out.println(var1 + " + " + var2 + " = " + summa(var1, var2));
    }

    public static int summa(int var1, int var2) {
        return var1 + var2;
    }
}
