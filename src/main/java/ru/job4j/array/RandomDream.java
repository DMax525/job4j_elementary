package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String prize = null;
        if (num <= prizes.length) {
            prize = prizes[num - 1];
        } else if (num > prizes.length) {
            while (num >= prizes.length) {
                if (num != 4) {
                    num = num - 1 - prizes.length;
                } else {
                    num -= prizes.length;
                }
                prize = prizes[num];
            }
        }
        return prize;
    }
}
