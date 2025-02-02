package dev.patika.definexjavaspringbootbootcamp2025.cleancode.exceptionhandling;

public class Dirty {
    public int divide(int a, int b) {
        try {
            return a/b;
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
}
