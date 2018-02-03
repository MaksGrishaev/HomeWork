package hw9.task2;

public class Shapes {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(10, 10, 5.5, "RED");
        shapes[1] = new Rectangle(1, 2, 10.0, 7.3, "GREEN");
        shapes[2] = new Circle(7, 7, 6, "BLUE");
        shapes[3] = new Circle(10, 10, 5.5, "RED");

        for (Shape shape : shapes) {
            shape.draw();
        }

        if (shapes[0].equals(shapes[1])) {
            System.out.println("Фигура 1 равна Фигуре 2");
        } else {
            System.out.println("Фигуры 1 и 2 не равны");
        }

        if (shapes[0].equals(shapes[2])) {
            System.out.println("Фигура 1 равна Фигуре 3");
        } else {
            System.out.println("Фигуры 1 и 3 не равны");
        }

        if (shapes[0].equals(shapes[3])) {
            System.out.println("Фигура 1 равна Фигуре 4");
        } else {
            System.out.println("Фигуры 1 и 4 не равны");
        }
    }
}
