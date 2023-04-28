package ua.hillel.korchuganov.lessons.lesson7;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];

        int numberOfPlayers = 25;
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < team1.length; i++) {
            team1[i] =(int)(Math.random() * 23) + 18;
            team2[i] =(int)(Math.random() * 23) + 18;

            sum1 += team1[i];
            sum2 += team2[i];
        }
        System.out.println("Вік гравців першої команди: ");
        System.out.println(Arrays.toString(team1));

        System.out.println("Вік гравців другої команди: ");
        System.out.println(Arrays.toString(team2));
        System.out.println();

        System.out.println("Сумма віку всіх гравців першої команди: " + sum1);
        System.out.println("Сумма віку всіх гравців другої команди: " + sum2);
        System.out.println();

        double avg1 = sum1 / numberOfPlayers;
        double avg2 = sum2 / numberOfPlayers;

        System.out.println("Середній вік гравців першої команди: " + avg1);
        System.out.println("Середній вік гравців другої команди: " + avg2);

    }
}
