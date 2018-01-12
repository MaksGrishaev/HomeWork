package hw3.task5;

public class RunningLights {
    public static void main(String[] args) {
        int count = 8;
        int garlandInt = 2048 + (int) (Math.random() * 16384);

        System.out.println("Задающее число: " + garlandInt);
        System.out.println("Гирлянда: \n" + Integer.toBinaryString(garlandInt));
        System.out.println("Режим №1");
        runningLights1(count, garlandInt);

        System.out.println("Режим №2");
        runningLights2(count, garlandInt);

        if ((garlandInt & 1) == 1) {
            System.out.println("Первая лампочка горит");
        } else {
            System.out.println("Первая ламочка не горит");
        }
    }

    public static void runningLights1(int count, int base) {
        for (int i = 0; i < count; i++) {
            printLights(base);
            printLights(~base);
        }
    }

    public static void runningLights2(int count, int base) {
        int buf;
        for (int i = 0; i < count; i++) {
            buf = base << 2;
            printLights(buf);
            base = buf;
        }
    }

    public static void printLights(int base) {
        for (int j = 0; j < 32 - (Integer.toBinaryString(base).length()); j++) {
            System.out.print(0);
        }
        System.out.println(Integer.toBinaryString(base));
    }
}
