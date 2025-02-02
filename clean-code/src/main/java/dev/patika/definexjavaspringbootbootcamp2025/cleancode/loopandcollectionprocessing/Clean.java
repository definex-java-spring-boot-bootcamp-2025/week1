package dev.patika.definexjavaspringbootbootcamp2025.cleancode.loopandcollectionprocessing;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Clean {
    public void processCollection(List<String> names) {
        List<String> filteredNames = names.stream()
                .filter(Objects::nonNull)
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
