package hw3.task4;

import hw3.task4.InputFloat;

public class MinRealNum {
    public static void main(String[] args) {
        float varFloat1 = InputFloat.inputFloat();
        float varFloat2 = InputFloat.inputFloat();
        float varFloat3 = InputFloat.inputFloat();
        System.out.println("Минимальное вещественное: " + min2Float(varFloat1, varFloat2));
        System.out.println("Минимальное из 2ух по модулю вещественное: " + min2Float(absFloat(varFloat1), absFloat(varFloat2)));
        System.out.println("Минимальное из 3ех по модулю вещественное: " + min3Float(absFloat(varFloat1), absFloat(varFloat2), absFloat(varFloat3)));

    }

    public static float absFloat(float var) {
        return var >= 0 ? var : -var;
    }

    public static float min2Float(float var1, float var2) {
        return var1 < var2 ? var1 : var2;
    }

    public static float min3Float(float var1, float var2, float var3) {
        if (var1 <= var2 && var1 <= var3)
            return var1;
        else if (var2 <= var1 && var2 <= var3)
            return var2;
        else
            return var3;
    }
}
