package ua.hillel.korchuganov.lessons.lesson15homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the drinks machine!");

        boolean ordering = true;
        while (ordering) {
            System.out.println("Please select a drink:");
            int index = 1;
            for (DrinksMachine drink : DrinksMachine.values()) {
                System.out.println(index + ". " + drink.getName());
                index++;
            }

            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= DrinksMachine.values().length) {
                DrinksMachine selectedDrink = DrinksMachine.values()[choice - 1];
                Drinks.makeDrink(selectedDrink);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("Would you like to order another drink? (y/n)");
            String continueOrder = scanner.next();
            ordering = continueOrder.equalsIgnoreCase("y");
        }

        System.out.println("Total drinks made: " + Drinks.getTotalDrinksCount());
        System.out.println("Total cost: $" + Drinks.getTotalCost());

        scanner.close();
    }
}