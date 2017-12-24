package hw3.task1;

public class TypeConvert {
    public static void main(String[] args) {
        byte varByte = 127; //-128..127
        short varShort = 32767; //-32768 .. 32767
        char varChar = 65535; //0..65,535
        int varInt = 2147483647; //-2,147,483,648..2,147,483,647
        long varLong = 9223372036854775807L; //-9,223,372,036,854,775,808..9,223,372,036,854,775,807
        float varFloat = 3.4E+38F; //3.4E+38..3.4E+38 (стандарт IEEE 754)
        double varDouble = 3333333333333D; //-1.7E+308..1.7E+308 (стандарт IEEE 754)

        convertByte(varByte);
        convertShort(varShort);
        convetChar(varChar);
        convetInt(varInt);
        convetLong(varLong);
        convetFloat(varFloat);
        convetDouble(varDouble);
    }

    public static void convertByte(byte var) {
        short res1 = var;
        char res2 = (char) var;
        int res3 = var;
        long res4 = var;
        float res5 = var;
        double res6 = var;
        System.out.println("\nBYTE to other type:");
        System.out.println("byte to short: " + res1);
        System.out.println("byte to char: " + res2);
        System.out.println("byte to int: " + res3);
        System.out.println("byte to long: " + res4);
        System.out.println("byte to float: " + res5);
        System.out.println("byte to double: " + res6);
    }

    public static void convertShort(short var) {
        byte res1 = (byte) var;
        char res2 = (char) var;
        int res3 = var;
        long res4 = var;
        float res5 = var;
        double res6 = var;
        System.out.println("\nSHORT to other type:");
        System.out.println("short to byte: " + res1);
        System.out.println("short to char: " + res2);
        System.out.println("short to int: " + res3);
        System.out.println("short to long: " + res4);
        System.out.println("short to float: " + res5);
        System.out.println("short to double: " + res6);
    }

    public static void convetChar(char var) {
        byte res1 = (byte) var;
        short res2 = (short) var;
        int res3 = var;
        long res4 = var;
        float res5 = var;
        double res6 = var;
        System.out.println("\nCHAR to other type:");
        System.out.println("char to byte: " + res1);
        System.out.println("char to short: " + res2);
        System.out.println("char to int: " + res3);
        System.out.println("char to long: " + res4);
        System.out.println("char to float: " + res5);
        System.out.println("char to double: " + res6);
    }

    public static void convetInt(int var) {
        byte res1 = (byte) var;
        short res2 = (short) var;
        char res3 = (char) var;
        long res4 = var;
        float res5 = var;
        double res6 = var;
        System.out.println("\nINT to other type:");
        System.out.println("int to byte: " + res1);
        System.out.println("int to short: " + res2);
        System.out.println("int to char: " + res3);
        System.out.println("int to long: " + res4);
        System.out.println("int to float: " + res5);
        System.out.println("int to double: " + res6);
    }

    public static void convetLong(long var) {
        byte res1 = (byte) var;
        short res2 = (short) var;
        char res3 = (char) var;
        int res4 = (int) var;
        float res5 = var;
        double res6 = var;
        System.out.println("\nLONG to other type:");
        System.out.println("long to byte: " + res1);
        System.out.println("long to short: " + res2);
        System.out.println("long to char: " + res3);
        System.out.println("long to int: " + res4);
        System.out.println("long to float: " + res5);
        System.out.println("long to double: " + res6);
    }

    public static void convetFloat(float var) {
        byte res1 = (byte) var;
        short res2 = (short) var;
        char res3 = (char) var;
        int res4 = (int) var;
        long res5 = (long) var;
        double res6 = var;
        System.out.println("\nFLOAT to other type:");
        System.out.println("float to byte: " + res1);
        System.out.println("float to short: " + res2);
        System.out.println("float to char: " + res3);
        System.out.println("float to int: " + res4);
        System.out.println("float to long: " + res5);
        System.out.println("float to double: " + res6);
    }

    public static void convetDouble(double var) {
        byte res1 = (byte) var;
        short res2 = (short) var;
        char res3 = (char) var;
        int res4 = (int) var;
        long res5 = (long) var;
        float res6 = (float) var;
        System.out.println("\nDOUBLE to other type:");
        System.out.println("double to byte: " + res1);
        System.out.println("double to short: " + res2);
        System.out.println("double to char: " + res3);
        System.out.println("double to int: " + res4);
        System.out.println("double to long: " + res5);
        System.out.println("double to float: " + res6);
    }
}
