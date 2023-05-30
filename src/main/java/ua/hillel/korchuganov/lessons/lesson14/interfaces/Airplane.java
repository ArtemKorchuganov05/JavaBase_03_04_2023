package ua.hillel.korchuganov.lessons.lesson14.interfaces;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane fly");
    }
}
