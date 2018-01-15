package hw5.task9;

public class SelectionSortMethods {
    public static void arrayIntShow(int[] varArr) {
        for (int i = 0; i < varArr.length; i++) {
            System.out.print(varArr[i] + " ");
        }
    }

    public static void arrayIntSortMinMaxVis(int[] array) {
        System.out.println("i\tj\tact\t\tarray");
        char flag = '-';
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            flag = '-';
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                    flag = '+';
                }
            }
            if (pos != i) {
                array[pos] = array[i];
                array[i] = min;
            }
            System.out.print(i + "\t" + (pos - 1) + "\t" + flag + '\t');
            arrayIntShow(array);
            System.out.println();
        }
    }

    public static void arrayIntSortMaxMinVis(int[] array) {
        System.out.println("i\tj\tact\t\tarray");
        char flag = '-';
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int max = array[i];
            flag = '-';
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    pos = j;
                    max = array[j];
                    flag = '+';
                }
            }
            if (pos != i) {
                array[pos] = array[i];
                array[i] = max;
            }
            System.out.print(i + "\t" + pos + "\t" + flag + '\t');
            arrayIntShow(array);
            System.out.println();
        }
    }
}
