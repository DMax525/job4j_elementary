package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when12to10then2() {
        double expected = 2;
        Point a = new Point(1, 2);
        Point b = new Point(1, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to20then1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when134to402then4dot69() {
        double expected = 4.69;
        Point a = new Point(1, 3, 4);
        Point b = new Point(4, 0, 2);
        //double dist = a.distance(b);
        double dist3d = a.distance3d(b);
        Assert.assertEquals(expected, dist3d, 0.01);
    }

    @Test
    public void when042to516then7dot07() {
        double expected = 7.07;
        Point a = new Point(0, 4, 2);
        Point b = new Point(5, 1, 6);
        //double dist = a.distance(b);
        double dist3d = a.distance3d(b);
        Assert.assertEquals(expected, dist3d, 0.01);
    }
}
