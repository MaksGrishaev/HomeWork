package hw5.task8;
/*
Реализовать задачу с гирляндой используя массивы.
Для реализации бегущей строки используйте метод System.arraycopy(...);
*/

public class ArrayGarland {
    public static void main(String[] args) {
        int[] garland = new int[50];
        ArrayGarlandMethods.generateBinGarland(garland);
        ArrayGarlandMethods.garlandChoice(garland);
    }

}
