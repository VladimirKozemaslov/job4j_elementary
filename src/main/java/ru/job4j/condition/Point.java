package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(2, 5, 3, 8);
        System.out.println("result (2, 5) to (3, 8) " + result);

        result = Point.distance(6, 14, -3, -7);
        System.out.println("result (6, 14) to (-3, -7) " + result);

        result = Point.distance(3, -2, 7, 10);
        System.out.println("result (3, -2) to (7, 10) " + result);
    }
}