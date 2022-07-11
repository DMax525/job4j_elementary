package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are " + euro + " euro. Test result: " + passed);
        float dollar = Converter.rubleToDollar(320);
        in = 320;
        expected = 5.3333335f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("320 rubles are " + dollar + " dollars. Test result: " + passed);
    }
}

