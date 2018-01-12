package hw4.task2;

public class ParityCheckArgs {
    public static void main(String[] args) {
        int varInt = Integer.parseInt(args[0]);
        if (varInt % 2 == 1) {
            System.out.println(varInt);
        } else
            System.out.println("Аргумент четный");
    }
}
