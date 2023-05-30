package ua.hillel.korchuganov.lessons.lesson14.interfaces;

public class Bird implements Flyable, Runnable {

    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void demoDefaultMethod() {
        Flyable.super.demoDefaultMethod();
        Runnable.super.demoDefaultMethod();

        System.out.println("demoDefaultMethod Bird");
    }
}
