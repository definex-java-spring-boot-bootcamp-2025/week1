package dev.patika.definexjavaspringbootbootcamp2025.cleancode.booleancomparisons;

public class Clean {
    public boolean isValid(String value) {
        return value.length() >= 18 && !value.isEmpty() && !value.equals("BlaBla");
    }
}
