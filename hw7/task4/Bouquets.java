package hw7.task4;

public class Bouquets {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[9];
        flowers[0] = new Rose("red");
        flowers[1] = new Rose("red");
        flowers[2] = new Rose("red");
        flowers[3] = new Tulip("white");
        flowers[4] = new Tulip("white");
        flowers[5] = new Tulip("white");
        flowers[6] = new Chamomile("yellow");
        flowers[7] = new Chamomile("yellow");
        flowers[8] = new Chamomile("yellow");

        System.out.println("Всего продано цветов: " + Flower.getCountFlowers());
        System.out.printf("Всего продано роз: %d. Стоимость: %.2f\n",
                Rose.getCount(), Rose.getCount() * Rose.getCost());
        System.out.printf("Всего продано тюльпанов: %d. Стоимость: %.2f\n",
                Tulip.getCount(), Tulip.getCount() * Tulip.getCost());
        System.out.printf("Всего продано ромашек: %d. Стоимость: %.2f\n",
                Chamomile.getCount(), Chamomile.getCount() * Chamomile.getCost());
        System.out.printf("Стоимость покупки: %.2f",
                Rose.getCount() * Rose.getCost() + Tulip.getCount() * Tulip.getCost() +
                        Chamomile.getCount() * Chamomile.getCost());
    }
}
