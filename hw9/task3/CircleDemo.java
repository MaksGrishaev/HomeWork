package hw9.task3;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println(circle);
        System.out.printf("Площадь круга радиусом %.2f: %.2f\n",
                circle.getRadiuse(), circle.squareCircle());
        System.out.printf("Длина окружности радиусом %.2f: %.2f\n",
                circle.getRadiuse(), circle.lengthCircle());
    }
}
