package dev.patika.definexjavaspringbootbootcamp2025.cleancode.exceptionhandling;

public class Clean {
    public int divide(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        return dividend / divisor;
    }
}
