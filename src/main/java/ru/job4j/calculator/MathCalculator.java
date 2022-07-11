package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDiv(double first, double second) {
        return diff(first, second)
                + div(first, second);
    }

    public static double allFourSum(double first, double second) {
        return sumAndMultiply(first, second)
                + diffAndDiv(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма сложения и умножения: " + sumAndMultiply(10, 20));
        System.out.println("Сумма разности и деления: " + diffAndDiv(50, 100));
        System.out.println("Сумма четырех операций: " + allFourSum(30, 40));
    }
}
