package ua.hillel.korchuganov.lessons.lesson14homework;

import java.util.SortedMap;

public class IPnones implements Smartphones, iOs {

    @Override
    public void call() {
        System.out.println("Calling from iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on iPhone");
    }

    @Override
    public void runiOSCommands() {
        System.out.println("Running iOS commands on iPhone");
    }
}
