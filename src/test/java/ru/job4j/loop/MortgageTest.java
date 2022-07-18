package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class MortgageTest {
    @Test
    public void when1Year() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2Year() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when3Year() {
        int amount = 100000;
        int salary = 50000;
        double percent = 6.1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}
