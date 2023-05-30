package ua.hillel.korchuganov.lessons.lesson14.interfaces;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();

//        bird.fly();
//        bird.run();

//        Airplane airplane = new Airplane();
//
//        airplane.fly();

        bird.demoDefaultMethod();

        System.out.println(FlyableAndRunnableChild.DISTANCE);

        Flyable[] flyables = {
                new Bird(),
                new Airplane()};
    }
}
