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

    @Test
    public void whenMax25To4To31Then31() {
        int numOne = 25;
        int numTwo = 4;
        int numThree = 31;
        int result = Max.max(numOne, numTwo, numThree);
        int expected = 31;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax43To1025To99To38Then31() {
        int numOne = 43;
        int numTwo = 1025;
        int numThree = 99;
        int numFour = 38;
        int result = Max.max(numOne, numTwo, numThree, numFour);
        int expected = 1025;
        Assert.assertEquals(result, expected);
    }
}