package ua.hillel.korchuganov.lessons.lesson15homework;

public enum DrinksMachine {
    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    SODA("Soda"),
    COCA_COLA("Coca Cola");
    ;

    private final String name;
    DrinksMachine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
