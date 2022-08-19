package ru.job4j.condition;

public class Max {
    public static int max(int one, int two) {
        return one > two ? one : two;
    }

    public static int max(int one, int two, int three) {
        int oneTwo = max(one, two);
        return oneTwo > three ? oneTwo : three;
    }

    public static int max(int one, int two, int three, int four) {
        int oneTwoThree = max(one, two, three);
        return oneTwoThree > four ? oneTwoThree : four;
    }
}
