package ua.hillel.korchuganov.lessons.lesson14.interfaces;

public interface FlyableAndRunnableChild extends Flyable, Runnable{

    @Override
    default void demoDefaultMethod() {
//        Flyable.super.demoDefaultMethod();
//        Runnable.super.demoDefaultMethod();

        System.out.println("demoDefaultMethod FlyableAndRunnableChild");
    }

}
