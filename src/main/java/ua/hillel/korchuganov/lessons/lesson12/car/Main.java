package ua.hillel.korchuganov.lessons.lesson12.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes-Benz");
        car.start();

        System.out.println(car.getModelName());


    }
}
