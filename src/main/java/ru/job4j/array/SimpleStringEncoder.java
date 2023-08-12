package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter ++;
            } else {
                result += counter < 2 ? symbol : symbol + String.valueOf(counter);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        return result += counter < 2 ? String.valueOf(symbol) : symbol + String.valueOf(counter);
    }
}
