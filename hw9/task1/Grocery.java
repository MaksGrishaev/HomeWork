package hw9.task1;

public class Grocery {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[10];
        fruits[0] = new Apple(0.2);
        fruits[1] = new Apple(0.4);
        fruits[2] = new Apple(0.1);
        fruits[3] = new Apple(0.2);
        fruits[4] = new Pear(0.3);
        fruits[5] = new Pear(0.3);
        fruits[6] = new Pear(0.3);
        fruits[7] = new Pear(0.3);
        fruits[8] = new Apricot(0.1);
        fruits[9] = new Apricot(0.1);

        System.out.printf("Продано %d яблок(a), весом %.2f кг. Стоимость: %.2f.\n",
                Apple.getCount(),Apple.getCommonWeight(), calcCost(fruits,"Apple"));
        System.out.printf("Продано %d абрикос, весом %.2f кг. Стоимость: %.2f.\n",
                Apricot.getCount(),Apricot.getCommonWeight(), calcCost(fruits,"Apricot"));
        System.out.printf("Продано %d груш(и), весом %.2f кг. Стоимость: %.2f.\n",
                Pear.getCount(),Pear.getCommonWeight(), calcCost(fruits,"Pear"));
        System.out.printf("Стоимость фруктов: %.2f",
                calcCost(fruits,"Apple") + calcCost(fruits,"Apricot") + calcCost(fruits,"Pear"));
    }

    public static double calcCost(Fruit[] fruits,String nameFr) {
        double sum = 0;
        for (Fruit fr : fruits) {
            if (fr.getFruitName().equals(nameFr)) {
                sum += fr.getCost();
            }
        }
        return sum;
    }
}
