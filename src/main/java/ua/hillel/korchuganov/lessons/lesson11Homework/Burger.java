package ua.hillel.korchuganov.lessons.lesson11Homework;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayo;

     Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;

        System.out.println("Склад звичайного бургера: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayo);
    }

     Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        System.out.println("Склад дієтичного бургера: " + bun + ", " + meat + ", " + cheese + ", " + greens);
    }

     Burger(String bun, String meat, String cheese, String greens, String mayo,boolean doubleMeat) {
        this.bun = bun;
        this.meat = doubleMeat ? meat + ", " + meat : meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;

        System.out.println("Склад бургера з подвійним м'ясом: " + bun + ", " + this.meat + ", " + cheese + ", " + greens + ", " + mayo);
    }

}
