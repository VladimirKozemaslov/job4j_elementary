package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {
    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP3K5Square0p31() {
        double expected = 0.31;
        int p = 3;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1p5Square0p96() {
        double expected = 0.96;
        int p = 4;
        double k = 1.5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}