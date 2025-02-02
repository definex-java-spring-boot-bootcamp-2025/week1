package dev.patika.definexjavaspringbootbootcamp2025.fundamentalsofjava;

import dev.patika.definexjavaspringbootbootcamp2025.fundamentalsofjava.model.Mail;

public class PassByValueDemo {
    public static void main(String[] args) {
        System.out.println("Pass by Value");


        Mail mail = new Mail();
        /**
         * JVM mail değişkeni için stack memory'den yer alir. Adresi ABC olur.
         * Mail'in instance degeri heap memory'deki 0x1Abe3f adresinde olusur.
         * ABC adresi degiskeni, 0x1Abe3f adresindeki veriye işaret eder.
         */
        mail.setMessage("Merhaba patika.dev");
        System.out.println("Current message: " + mail.getMessage());
        /**
         * 0x1Abe3f adresindeki Mail objesinin message degeri "Merhaba patika.dev" olur.
         */
        changeMail(mail);
        System.out.println("New message: " + mail.getMessage());

        int threshold = 10;
        System.out.println("current threshold: " + threshold);
        /**
         * Primitive Type'larin memory yonetimi farklidir. Bu nedenle PassByValue farkli calisir
         * İşaretleme ve Değer ayni stack'de yer alir.
         */
        changeThreshold(threshold);
        System.out.println("new threshold: " + threshold);
    }

    public static void changeMail(Mail mail) {
        /**
         * JVM changeMail metodundaki mail değişkeni için stack memory'den yer alir. Adresi DEF olur.
         * JVM PassByValue yontemi ile ABC adresinin pointer'ini kopyalar ve
         * 0x1Abe3f adresindeki veriye işaret etmesini saglar.
         *
         */
        mail.setMessage("Merhaba definex");
        /**
         * 0x1Abe3f adresindeki Mail objesinin message degeri "Merhaba definex" olur.
         */
    }

    public static void changeThreshold(int threshold) {
        /**
         * JVM changeThreshold metoduna gonderilen degeri kopyasini olusturur.
         * Stack'de olusan kopya ayni veriyi tasir ama iki degisken ayni veriye isaret etmez.
         * Bu nedenle bu metod içerisinde primitive type değerini return ile dışarıya taşımadığınız
         * sürece etkisi sadece bu metod'da olur.
         */
        threshold = 20;
    }
}
