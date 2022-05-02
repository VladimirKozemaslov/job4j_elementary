package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int numOne, int numTwo, int numThree) {
        return max(max(numOne, numTwo), numThree);
    }

    public static int max(int numOne, int numTwo, int numThree, int numFour) {
        return max(max(numOne, numTwo, numThree), numFour);
    }
}