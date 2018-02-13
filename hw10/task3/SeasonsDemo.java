package hw10.task3;

public class SeasonsDemo {
    enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) {
        Season season = Season.SPRING;
        if (season == Season.SPRING) season = Season.SUMMER;
        System.out.println(season);
    }
}
