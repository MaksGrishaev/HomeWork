package hw2.task1_literal;

/***
 * Created by Maksim on 12.12.2017
 */

public class Literal {
    public static void main(String[] args) {
        boolean varBool = true;
        String varString = "Hello, World!";
        char varChar = '\u2622';
        int varIntBin = 0b10101;  //21
        int varIntOct = 0707;     //455
        int varIntDec = 777;      //77
        int varIntHex = 0x654321; //6636321
        float varFl = 123.456f;
        double varDouble = 123456.789D;

        System.out.println(varBool);
        System.out.println(varString);
        System.out.println(varChar);
        System.out.println(varIntBin);
        System.out.println(varIntOct);
        System.out.println(varIntDec);
        System.out.println(varIntHex);
        System.out.println(varFl);
        System.out.println(varDouble);
    }
}

