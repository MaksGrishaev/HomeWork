package hw4.task9;

public class FactorialFor {
    public static void main(String[] args) {
        int varInt = (int) (Math.random() * 100);
        System.out.println(varInt + "! = " + factorialFor(varInt));
        System.out.println(varInt + "! = " + factorialClassic(varInt));
    }

    public static long factorialFor(int var) {
        long res = 1;
        if (var == 0 || var == 1)
            return 1;
        else {
            for (int i = 2; i <= var; i++) {
                res *= i;
            }
        }
        return res;
    }

    public static long factorialClassic(int var) {
        if (var == 0)
            return 1;
        else
            return var * factorialClassic(var - 1);
    }
}

