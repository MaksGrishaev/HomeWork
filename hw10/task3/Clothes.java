package hw10.task3;

public class Clothes {
    public static void main(String[] args) {

    }

    public enum Sizes {
        XXS(32) {
            public String getDescription() {
                return "Детский размер";
            }
        }, XS(34), S(36), M(38), L(40);
        int size;

        Sizes(int size) {
            this.size = size;
        }

        public String getDescription() {
            return "Взрослый размер";
        }
    }

    public interface ManClothes{
        void clothMan();
    }

    public interface WomanClothes{
        void clothWoman();
    }

    public abstract class Clothess{
        private Sizes size;
        private int price;
        private String color;

        public void setSize(Sizes size) {
            this.size = size;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Sizes getSize() {
            return size;
        }

        public int getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Clothess{" +
                    "size=" + size +
                    ", price=" + price +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public class TShirt extends Clothess{

    }
}

