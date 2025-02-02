package dev.patika.definexjavaspringbootbootcamp2025.fundamentalsofjava;

public class MutabilityDemo {
    public static void main(String[] args) {
        //
        //
        //
        // title => "abb"
        // title => "abbb"
        // title => "abbbb"

        /**
         *  Immutable String!!!
         *  String title = "a";
         *  title = "ab"; => Bu atama yapıldığında JVM memory'de hem veri hem degisken icin memory'de yer ayirir.
         *  title => "abb" => Her yeni atama veya yeni bir string concat ederken, JVM memory'de hem veri hem degisken icin memory'de yer ayirir
         *  Bu nedenle buyuk String operasyonlarinda String kullanmak maliyetli oluyor.
         *  String result = "a";
         *  for (int idx = 0; idx < 10_000_000; idx++) {
         *      result += "b";
         *  }
         *  System.out.println(result);
        */

        /**
         * Maliyeti dusuk bir yaklasim icin StringBuilder veya StringBuffer(Thread Safe) kullanilmali
         * Cunku her seferinde ek olarak yeni bir degisken olusturmak icin memory'de yer ayirmamiza gerek kalmaz.
         * Sadece veriyi ArrayList'e ekleme maliyetimiz bulunuyor.
         */
        // stringBuilder => "a"
        //                 => "b"
        //                 => "b"
        //                 => "b"
        //                 => "b"
        //                 => "b"
        //                 => "b"
        //                 => "b"
        //                 => "b"
        //                 => "b"

        StringBuilder result2 = new StringBuilder();

        for (int idx = 0; idx < 10_000_000; idx++) {
            result2.append("b");
        }
        System.out.println(result2.toString());
    }
}
