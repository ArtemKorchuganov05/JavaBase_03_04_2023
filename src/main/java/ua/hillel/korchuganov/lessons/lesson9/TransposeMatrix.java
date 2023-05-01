package ua.hillel.korchuganov.lessons.lesson9;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість рядків матриці: ");
        int m;
        while (true) {
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                if (m > 0) {
                    break;
                } else {
                    System.out.println("Кількість рядків повинна бути додатнім числом. Спробуйте ще раз: ");
                }
            } else {
                System.out.println("Некоректне введення.Спробуйте ще раз: ");
                scanner.next();
            }
        }

        System.out.println("Введіть кількість стовпців матриці: ");
        int n;
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Кількість стовпців повинна бути додатнім числом. Спробуйте ще раз: ");
                }
            } else {
                System.out.println("Некоректне введення.Спробуйте ще раз: ");
                scanner.next();
            }
        }
        System.out.println();

        int[][] matrix = new int[m][n];


        for (int i = 0; i < matrix.length; i++) { // Матриця с рандомними елементами в масиві
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 101);
            }
        }

        int[][] transposedMatrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Матриця с рандомними елементами в масиві: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println("Транспонована матриця: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}