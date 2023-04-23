package ua.hillel.korchuganov.lessons.lesson6;

import java.util.Scanner;


public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 11);

        int i = 1;
        int attempts = 3;

        System.out.println("Вгадайте число в діапазоні від 0 до 10. У вас є " + attempts + " спроби.");
        System.out.println("Рандомне число: " + number);


        while (i <= attempts) {
            System.out.print("Спроба " + i + ": ");

            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();
                if (guess >= 0 && guess <= 10) {
                    System.out.println("Ваше число: " + guess);
                } else {
                    System.out.println("Число повинно бути в діапазоні від 0 до 10. Спробуйте ще раз");
                }
                if (guess == number) {
                    System.out.println("Ви вгадали! Загадане число було " + number + ".");
                    break;
                } else if (i == attempts) {
                    System.out.println("Ви не вгадали. Загадане число було " + number + ".");
                    break;
                } else {
                    System.out.println("Не вгадали. Спробуйте ще раз.");
                }
            } else {
                System.out.println("Неправильні дані! Спробуйие ще раз!");
            }
            scanner.nextLine();
            i++;
        }
    }
}
