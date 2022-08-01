package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        int code = name.codePointAt(0);
        if (code < 97 || code > 122) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            code = name.codePointAt(i);
            if ((code > 32 && code < 36) || (code > 36 && code < 48) || (code > 57 && code < 65) || (code > 90 && code < 95) || (code > 122)) {
                return false;
            }
        }
        return true;
    }
}
