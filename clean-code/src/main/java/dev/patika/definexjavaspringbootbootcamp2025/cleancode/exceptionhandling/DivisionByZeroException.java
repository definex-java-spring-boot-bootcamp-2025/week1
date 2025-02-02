package dev.patika.definexjavaspringbootbootcamp2025.cleancode.exceptionhandling;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
