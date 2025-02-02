package dev.patika.definexjavaspringbootbootcamp2025.cleancode.defaultvalues;

public class Clean {
    private static final String DEFAULT_ENVIRONMENT = "development";
    private final String environment;

    public Clean(String environment) {
        this.environment = environment != null ? environment : DEFAULT_ENVIRONMENT;
    }

    public String getEnvironment() {
        return environment;
    }
}
