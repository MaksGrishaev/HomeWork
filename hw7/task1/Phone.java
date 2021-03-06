package hw7.task1;

public class Phone {
    private String name;
    private String number;
    private String model;
    private int weight;
    private static int count = 0;

    Phone() {
        name = null;
        model = null;
        number = null;
        weight = 0;
        count++;
    }

    Phone(String number) {
        this.number = number;
        count++;
    }

    Phone(String name, String num) {
        this(num);
        this.name = name;
    }

    Phone(String name, String number, String model) {
        this(name, number);
        this.model = model;
    }

    Phone(String name, String num, String mod, int w) {
        this(name, num);
        this.model = mod;
        weight = w;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public static int getCount() {
        return count;
    }

    void receiveCall(String inName) {
        System.out.println("MESSAGE from : " + this.name);
        System.out.println("\tЗвонит " + inName);
    }

    void receiveCall(String inName, String inNum) {
        System.out.println("MESSAGE from : " + this.name);
        System.out.print("\tЗвонит " + inName);
        System.out.println(", номер : " + inNum);
    }

    void sendMessage(String... outNum) {
        System.out.println("Отправляем сообщение с номера " + this.number + " номерам:");
        for (String tmp : outNum) {
            System.out.println("\t" + tmp);
        }
    }

    void showInfo() {
        System.out.println("----------------------");
        if (name != null) {
            System.out.print("-Имя: " + name);
        } else {
            System.out.print("-Имя: не указано");
        }
        if (getNumber() != null) {
            System.out.print("\n-\tНомер: " + getNumber());
        } else {
            System.out.print("\n-\tНомер: не указан");
        }
        if (model != null) {
            System.out.print("\n-\tМодель: " + model);
        } else {
            System.out.print("\n-\tМодель: не указана");
        }
        if (weight > 0) {
            System.out.print("\n-\tВес: " + weight);
        } else {
            System.out.print("\n-\tВес: не указан");
        }
        System.out.println("\n----------------------");
    }
}
