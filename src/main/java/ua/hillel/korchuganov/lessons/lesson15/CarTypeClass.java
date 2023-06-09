package ua.hillel.korchuganov.lessons.lesson15;

public class CarTypeClass {

    private String type;

    public static final CarTypeClass CAR = new CarTypeClass("Автомобіль");
    public static final CarTypeClass BUS = new CarTypeClass("Автобус");
    public static final CarTypeClass TRUCK = new CarTypeClass("Вантажівка");
    public static final CarTypeClass MOTORCYCLE = new CarTypeClass("Мотоцикл");

    private CarTypeClass(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
