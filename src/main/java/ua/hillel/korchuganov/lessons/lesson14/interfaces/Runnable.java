package ua.hillel.korchuganov.lessons.lesson14.interfaces;

public interface Runnable {

    void run();

    default void  demoDefaultMethod(){
        System.out.println("demoDefualtMethod Runnable");
    }
}
