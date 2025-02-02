package dev.patika.definexjavaspringbootbootcamp2025.cleancode.loopandcollectionprocessing;

import java.util.ArrayList;
import java.util.List;

public class Dirty {
    // Bence bu case goreceli. Halen bu yaklasimi tercih edenler var.
    public void processCollection(List<String> names) {
        List<String> filteredNames = new ArrayList<>();
        for(int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if(name != null && name.length() > 3) {
                name = name.toUpperCase();
                filteredNames.add(name);
            }
        }
    }
}
