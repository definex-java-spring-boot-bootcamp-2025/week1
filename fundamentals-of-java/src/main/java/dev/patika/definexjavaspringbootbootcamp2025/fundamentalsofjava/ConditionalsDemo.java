package dev.patika.definexjavaspringbootbootcamp2025.fundamentalsofjava;

import dev.patika.definexjavaspringbootbootcamp2025.fundamentalsofjava.model.Mail;

public class ConditionalsDemo {

    private static final String deger = "Dünya";

    static {
        System.out.printf("Merhaba %s%n", deger);
    }

    public static void main(String[] args) {
        System.out.println("Fundamentals of Java");
        int threshold = 9;
        Mail mail = new Mail(); // Deneme'nin instance degeri memory'deki 0x1Abe3f adresinde olusur
        mail.setMessage("Merhaba patika.dev");
        // ABC => 0x1Abe3f ABC => memory'de degisken'in tutuldugu adres
        changeDeneme(mail, threshold);
        System.out.println(mail.getMessage());

        threshold = 120;
        changeDeneme(mail, threshold);
        System.out.println(mail.getMessage());

        threshold = 89;
        changeDeneme(mail, threshold);
        System.out.println(mail.getMessage());
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
}
