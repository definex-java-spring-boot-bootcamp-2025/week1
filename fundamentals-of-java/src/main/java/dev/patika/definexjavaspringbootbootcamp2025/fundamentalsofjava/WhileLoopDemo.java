package dev.patika.definexjavaspringbootbootcamp2025.fundamentalsofjava;

import dev.patika.definexjavaspringbootbootcamp2025.fundamentalsofjava.model.Mail;

import java.util.Arrays;
import java.util.List;

public class WhileLoopDemo {

    private static final String deger = "Dünya";

    static {
        System.out.printf("Merhaba %s%n", deger);
    }

    public static void main(String[] args) {
        System.out.println("Fundamentals of Java");
        Integer[] thresholds = new Integer[]{9, 120, 89};
        List<Integer> immutableThresholds = Arrays.asList(thresholds);

        Mail mail = new Mail(); // Deneme'nin instance degeri memory'deki 0x1Abe3f adresinde olusur
        mail.setMessage("Merhaba patika.dev");
        // ABC => 0x1Abe3f ABC => memory'de degisken'in tutuldugu adres

        int index = 0;
        while(index < immutableThresholds.size()) {
            changeDeneme(mail, immutableThresholds.get(index));
            System.out.println(mail.getMessage());
            index++;
        }
    }

    public static void changeDeneme(Mail mail, int threshold) {
        // DEF => 0x1Abe3f
        if (threshold > 90) {
            mail.setMessage("Merhaba definex");
        } else if (threshold < 10) {
            mail.setMessage("Merhaba java");
        } else {
            mail.setMessage("Merhaba dünya");
        }
    }
    /*
    Merhaba Dünya
    Fundamentals of Java
    Merhaba java
    Merhaba definex
    Merhaba dünya
     */
}
