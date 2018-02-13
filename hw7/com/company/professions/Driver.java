package hw7.com.company.professions;

public class Driver extends Person {
    private int experience;

    public Driver(String fio, int age, int experience) {
        super(fio, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "\tФИО: " + getFio() +
                ".\n\t\t\tВозраст: " + getAge() +
                ".\n\t\t\tОпыт: " + getExperience() + ".";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
