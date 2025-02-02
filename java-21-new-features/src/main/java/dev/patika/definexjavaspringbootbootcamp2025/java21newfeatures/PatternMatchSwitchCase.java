package dev.patika.definexjavaspringbootbootcamp2025.java21newfeatures;

public class PatternMatchSwitchCase {
    public static void main(String[] args) {
        Object obj = Integer.valueOf(5);
        String result = switch (obj) {
            case String s when s.length() > 5 -> "Long string: " + s.toUpperCase();
            case String s -> "Short string: " + s;
            case Integer i -> "Number: " + (i * 2);
            case null -> "Null value";
            default -> "Unknown type";
        };
        System.out.printf("%s", result);
    }
}
