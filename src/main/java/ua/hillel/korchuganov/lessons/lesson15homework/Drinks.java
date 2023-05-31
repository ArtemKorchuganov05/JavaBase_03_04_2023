package ua.hillel.korchuganov.lessons.lesson15homework;

import javax.print.DocFlavor;

public class Drinks {
    private static final double COFFEE_PRICE = 2.5;
    private static final double TEA_PRICE = 1.8;
    private static final double LEMONADE_PRICE = 2.0;
    private static final double MOJITO_PRICE = 3.5;
    private static final double SODA_PRICE = 1.5;
    private static final double COCA_COLA_PRICE = 2.2;

    private static int totalDrinksCount = 0;
    private static double totalCost = 0.0;

    public static void makeDrink(DrinksMachine drink){
        totalDrinksCount++;
        double price = getPrice(drink);
        totalCost += price;
        System.out.println("Making" + drink.getName() + " ($" + price  + ")");
    }

    private static double getPrice(DrinksMachine drink){
        switch (drink){
            case COFFEE:
                return COFFEE_PRICE;
            case TEA:
                return TEA_PRICE;
            case LEMONADE:
                return LEMONADE_PRICE;
            case MOJITO:
                return MOJITO_PRICE;
            case SODA:
                return SODA_PRICE;
            case COCA_COLA:
                return COCA_COLA_PRICE;
            default:
               return 0;
        }
    }

    public static int getTotalDrinksCount() {
        return totalDrinksCount;
    }

    public static double getTotalCost() {
        return totalCost;
    }
}
