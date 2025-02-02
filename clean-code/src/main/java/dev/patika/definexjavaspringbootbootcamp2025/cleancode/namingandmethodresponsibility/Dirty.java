package dev.patika.definexjavaspringbootbootcamp2025.cleancode.namingandmethodresponsibility;

public class Dirty {
    public void process(String s) {
        if(s != null) {
            s = s.trim();
            System.out.println(s);
            saveToDatabase(s);
            sendEmail(s);
        }
    }

    public void saveToDatabase(String s) {
        // save to database
    }

    public void sendEmail(String s) {
        // send email
    }
}
