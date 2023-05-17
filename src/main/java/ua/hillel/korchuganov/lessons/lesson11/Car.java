package ua.hillel.korchuganov.lessons.lesson11;

import java.util.Objects;

public class Car {
    String modalName;
    double fuelStatus;

    public Car(String modalName, double fuelStatus) {
        this.modalName = modalName;
        this.fuelStatus = fuelStatus;
    }

    public Car(String modalName) {
        this.modalName = modalName;
    }

    public Car(double fuelStatus) {
        this.fuelStatus = fuelStatus;
    }

}
