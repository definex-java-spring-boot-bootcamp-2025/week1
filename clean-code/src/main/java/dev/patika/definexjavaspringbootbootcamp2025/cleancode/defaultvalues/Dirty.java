package dev.patika.definexjavaspringbootbootcamp2025.cleancode.defaultvalues;

public class Dirty {
    private String environment;
    public String getEnvironment() {
        if (environment == null || environment.isEmpty()) {
            return "development";
        }
        return environment;
    }
}
