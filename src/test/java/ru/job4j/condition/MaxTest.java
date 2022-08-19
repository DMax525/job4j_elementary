package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int one = 1;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To1And1Then4() {
        int one = 3;
        int two = 1;
        int three = 4;
        int result = Max.max(one, two, three);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To2And2And1Then5() {
        int one = 2;
        int two = 2;
        int three = 1;
        int four = 5;
        int result = Max.max(one, two, three, four);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}