package dev.patika.definexjavaspringbootbootcamp2025.java21newfeatures;

import java.util.concurrent.Executors;

public class VirtualThread {
    public static void main(String[] args) {
        Thread vThread = Thread.ofVirtual().start(() -> {
            System.out.println("Running in virtual thread");
        });

        // Using ExecutorService with virtual threads
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> {
                //System.out.println("Task executed in virtual thread");
            });
        }
    }
}
