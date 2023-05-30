package ua.hillel.korchuganov.lessons.lesson14.interfaces;

public interface Flyable {
    public static final int DISTANCE = 20;

    public abstract void fly();

    default void  demoDefaultMethod(){
        System.out.println("demoDefualtMethod Flyable");
    }



}

