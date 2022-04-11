package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to38then3p16() {
        double expected = 3.16;
        int x1 = 2;
        int y1 = 5;
        int x2 = 3;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when6m14tom3m7then22p84() {
        double expected = 22.84;
        int x1 = 6;
        int y1 = 14;
        int x2 = -3;
        int y2 = -7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3m2to710then22p84() {
        double expected = 12.64;
        int x1 = 3;
        int y1 = -2;
        int x2 = 7;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}