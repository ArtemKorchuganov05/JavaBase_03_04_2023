package ua.hillel.korchuganov.lessons.lesson13.main;

public abstract class Animal {


        String name;
        int age;


        abstract void run();
        abstract void run2(String demo);
        abstract void run3();

        final void  demoMethod(){
                System.out.println("Default method");
        }
}
