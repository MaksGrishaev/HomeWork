package hw9.task3;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.5);
        Circle circle2 = new Circle(10);

        System.out.println(circle1);
        System.out.printf("Площадь круга радиусом %.2f: %.2f\n",
                circle1.getRadiuse(), circle1.squareCircle());
        System.out.printf("Длина окружности радиусом %.2f: %.2f\n",
                circle1.getRadiuse(), circle1.lengthCircle());

        System.out.println(circle2);
        System.out.printf("Площадь круга радиусом %.2f: %.2f\n",
                circle2.getRadiuse(), circle2.squareCircle());
        System.out.printf("Длина окружности радиусом %.2f: %.2f\n",
                circle2.getRadiuse(), circle2.lengthCircle());
    }
}
