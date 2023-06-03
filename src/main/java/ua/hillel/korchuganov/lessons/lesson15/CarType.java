package ua.hillel.korchuganov.lessons.lesson15;

public enum CarType {
    CAR("Автомобіль", 50000),
    BUS("Автобус"),
    TRUCK("Вантажівка"),
    MOTORCYCLE("Мотоцикл");

    private String type;
    private int price;

    CarType(String type) {
        this.type = type;
    }

    CarType(String type, int price) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
