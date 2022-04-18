package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.printf("Длина массива ages: %d\n", ages.length);
        String[] surnames = new String[100500];
        System.out.printf("Длина массива surnames: %d\n", surnames.length);
        float[] prices = new float[40];
        System.out.printf("Длина массива prices: %d\n", prices.length);

        String[] names = new String[4];
        names[0] = "Александр Пушкин";
        names[1] = "Лев Толстой";
        names[2] = "Федор Достоевский";
        names[3] = "Иван Гончаров";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
