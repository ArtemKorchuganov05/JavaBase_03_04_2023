package ua.hillel.korchuganov.lessons.lesson14.classes;

public class Main {
    public static void main(String[] args) {

       MyInterface myInterface = () -> {
           System.out.println("fdsfl");
       };

       myInterface.myMethod();
    }
}
