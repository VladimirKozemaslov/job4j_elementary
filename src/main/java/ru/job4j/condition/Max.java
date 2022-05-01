package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int numOne, int numTwo, int numThree) {
        int result = max(max(numOne, numTwo), numThree);
        return result;
    }

    public static int max(int numOne, int numTwo, int numThree, int numFour) {
        int result = max(max(numOne, numTwo, numThree), numFour);
        return result;
    }
}