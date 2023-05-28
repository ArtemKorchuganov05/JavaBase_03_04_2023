package ua.hillel.korchuganov.lessons.lesson14homework;

public class Androids implements Smartphones, LinuxOS{
    @Override
    public void call() {
        System.out.println("Calling from Android");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from Andorid");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on Android");
    }


    @Override
    public void runLinuxCommands() {
        System.out.println("Browsing the internet on Android");
    }
}
