package ua.hillel.korchuganov.lessons.lesson14homework;

public class Main {
    public static void main(String[] args) {
        Androids androidPhone = new Androids();
        IPnones iPhone = new IPnones();

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.runLinuxCommands();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.runiOSCommands();
    }
}
