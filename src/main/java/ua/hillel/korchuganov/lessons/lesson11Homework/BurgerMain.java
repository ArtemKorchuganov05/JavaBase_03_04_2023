package ua.hillel.korchuganov.lessons.lesson11Homework;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("сезамова", "яловичина", "чеддер","салат", "майонез");
        Burger dietBurger = new Burger("житня", "курятина", "моцарела", "помідори");
        Burger doubleMeatBurger = new Burger("кукурудзяна", "свинина", "гауда", "цибуля", "майонез", true);

    }
}
