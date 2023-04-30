package ua.hillel.korchuganov.lessons.lesson8;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        int[] first = new int[7];
        int[] second = new int[7];
        int matches = 0;

        for (int i = 0; i < first.length; i++) {
            first[i] = (int) (Math.random() * 10);
            second[i] = (int) (Math.random() * 10);
        }
        System.out.println("Числа, які загадані фірмою-організатором лотереї: ");
        System.out.println(Arrays.toString(first));
        System.out.println();
        System.out.println("Числа, які вгадав гравець: ");
        System.out.println(Arrays.toString(second));
        System.out.println();

        System.out.println("Відсортовані масиви: ");
        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println();

        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                matches++;
                System.out.println("Збіглися " + i + "-й індекси");
            }
        }

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println("Кількітсть збігів: " + matches);
    }
}
