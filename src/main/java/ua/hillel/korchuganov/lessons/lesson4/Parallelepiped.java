package ua.hillel.korchuganov.lessons.lesson4;

public class Parallelepiped {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        int c = 3;

        int volume = a * b * c;

        int length = 4 * (a + b + c);

        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Cумарна довжина всіх сторін = " + length);
    }
}
