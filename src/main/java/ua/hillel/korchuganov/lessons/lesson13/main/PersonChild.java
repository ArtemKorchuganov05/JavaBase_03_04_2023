package ua.hillel.korchuganov.lessons.lesson13.main;

public class PersonChild extends Person {


    public PersonChild(int age, String lastName) {
        super(age, lastName);

        System.out.println(this.age);
    }
}
