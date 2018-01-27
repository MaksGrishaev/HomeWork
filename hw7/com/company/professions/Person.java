package hw7.com.company.professions;

public class Person {
    String fio;
    int age;

    Person(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\tФИО: " + fio +
                ".\n\tВозраст: " + age + ".";
    }
}
