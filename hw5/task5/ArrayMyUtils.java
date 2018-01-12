package hw5.task5;

public class ArrayMyUtils {
    public static void arrayIntShow(int[] varArr) {
        for (int i = 0; i < varArr.length; i++) {
            System.out.print(varArr[i] + " ");
        }
    }

    public static void arrayIntCopy(int[] source, int[] dest) {
        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }
    }

    public static void arrayIntSortMinMaxVis(int[] varArr) {
        System.out.println("i\tj\tact\t\tarray");
        for (int i = varArr.length - 1; i > 0; i--) {
            boolean done = false;
            for (int j = 0; j < i; j++) {
                char flag = '-';
                if (varArr[j] > varArr[j + 1]) {
                    int tmp = varArr[j];
                    varArr[j] = varArr[j + 1];
                    varArr[j + 1] = tmp;
                    flag = '+';
                    done = true;
                }
                System.out.print(i + "\t" + j + "\t" + flag + '\t');
                ArrayMyUtils.arrayIntShow(varArr);
                System.out.println();
            }
            if (done != true)
                break;
        }
    }

    public static void arrayIntSort(int[] varArr) {
        System.out.println("i\tj\tact\t\tarray");
        for (int i = 0; i < varArr.length; i++) {
            boolean done = false;
            for (int j = 0; j < varArr.length - i - 1; j++) {
                char flag = '-';
                if (varArr[j] > varArr[j + 1]) {
                    int tmp = varArr[j];
                    varArr[j] = varArr[j + 1];
                    varArr[j + 1] = tmp;
                    flag = '+';
                    done = true;
                }
                System.out.print(i + "\t" + j + "\t" + flag + '\t');
                ArrayMyUtils.arrayIntShow(varArr);
                System.out.println();

            }
            if (done != true)
                break;
        }
    }

    public static void arrayIntSortMaxMinVis(int[] varArr) {
        System.out.println("i\tj\tact\t\tarray");
        for (int i = 0; i < varArr.length; i++) {
            boolean done = false;
            for (int j = 0; j < varArr.length - i - 1; j++) {
                char flag = '-';
                if (varArr[j] < varArr[j + 1]) {
                    int tmp = varArr[j];
                    varArr[j] = varArr[j + 1];
                    varArr[j + 1] = tmp;
                    flag = '+';
                    done = true;
                }
                System.out.print(i + "\t" + j + "\t" + flag + '\t');
                ArrayMyUtils.arrayIntShow(varArr);
                System.out.println();

            }
            if (done != true)
                break;
        }
    }
}
