package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to38then3p16() {
        double expected = 3.16;
        Point a = new Point(2, 5);
        Point b = new Point(3, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when6m14tom3m7then22p84() {
        double expected = 22.84;
        Point a = new Point(6, 14);
        Point b = new Point(-3, -7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3m2to710then22p84() {
        double expected = 12.64;
        Point a = new Point(3, -2);
        Point b = new Point(7, 10);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}