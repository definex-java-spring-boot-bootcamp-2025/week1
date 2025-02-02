package dev.patika.definexjavaspringbootbootcamp2025.oop.model;

public class Animal {

    public void eat() {
        System.out.println("Animal is eating its food!");
    }

    public void eat(String kasjdsa, boolean withMouth) {
        if (withMouth) {
            System.out.println("Animal is eating its food with its mouth!");
            return;
        }
        System.out.println("Animal is eating its food without its mouth!");
    }
}
