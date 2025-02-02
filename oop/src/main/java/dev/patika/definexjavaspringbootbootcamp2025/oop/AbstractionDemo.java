package dev.patika.definexjavaspringbootbootcamp2025.oop;

import dev.patika.definexjavaspringbootbootcamp2025.oop.model.MotorBike;
import dev.patika.definexjavaspringbootbootcamp2025.oop.model.MountainBike;
import dev.patika.definexjavaspringbootbootcamp2025.oop.model.TournamentBike;

import java.util.HashMap;
import java.util.Map;

public class AbstractionDemo {
    public static void main(String[] args) {
        HashMap<String, MotorBike> motorBikes = new HashMap<>();
        // List<>
        motorBikes.put("a", new MountainBike());
        motorBikes.put("b", new TournamentBike());

        for (Map.Entry<String, MotorBike> entry : motorBikes.entrySet()) {
            if(entry.getValue().getId().equals("a")) {
                entry.getValue().throttle();
            }
        }


        motorBikes.get("a").throttle();
    }
}
