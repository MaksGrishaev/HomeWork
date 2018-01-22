package hw5.task2;

public class ArrayString2 {
    public static void main(String[] args) {
        String[][] masStr = new String[3][6];
        char varChar = 'a';
        for (int i = 0; i < masStr.length; i++) {
            for (int j = 0; j < masStr[i].length; j++) {
                masStr[i][j] = varChar + Integer.toString(j + 1);
            }
            varChar++;
        }
        show2DArrayStr(masStr);
    }

    public static void show2DArrayStr(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (String str : array[i]) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
