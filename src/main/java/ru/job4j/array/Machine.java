package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int coin : coins) {
            int count = change / coin;
            for (int j = 0; j < count; j++) {
                rsl[size] = coin;
                size++;
            }
            change -= coin * count;
        }
        return Arrays.copyOf(rsl, size);
    }
}