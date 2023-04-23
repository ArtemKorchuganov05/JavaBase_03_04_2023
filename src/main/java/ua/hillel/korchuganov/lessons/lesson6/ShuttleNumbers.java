package ua.hillel.korchuganov.lessons.lesson6;

public class ShuttleNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 300; i++) {
            if (i % 10 == 4 || i % 10 == 9 || i / 10 == 4 || i / 10 == 9 || i / 10 % 10 == 4 || i / 10 % 10 == 9) {
                continue;
            }

            System.out.println(i);
            count++;

            if (count == 100) {
                System.out.println("Знайдено " + count + " номерів шатлів.");
                break;
            }
        }
    }
}


