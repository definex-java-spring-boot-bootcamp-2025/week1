package dev.patika.definexjavaspringbootbootcamp2025.cleancode.booleancomparisons;

public class Dirty {
    public boolean isValid(String value) {
        if (value.length() >= 18 && value.isEmpty() != true && value.equals("BlaBla") == false) {
            return true;
        }
        return false;
    }
}
