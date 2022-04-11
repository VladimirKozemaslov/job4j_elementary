package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax100To99Then100() {
        int left = 100;
        int right = 99;
        int result = Max.max(left, right);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax666To777Then777() {
        int left = 666;
        int right = 777;
        int result = Max.max(left, right);
        int expected = 777;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax21To21Then21() {
        int left = 21;
        int right = 21;
        int result = Max.max(left, right);
        int expected = 21;
        Assert.assertEquals(result, expected);
    }
}