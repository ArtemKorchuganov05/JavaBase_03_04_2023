package ua.hillel.korchuganov.lessons.lesson4;

public class ChineseDynasties {
    public static void main(String[] args) {
        int warriorLee = 13;
        int archerLee = 24;
        int riderLee = 46;

        int warriorsOfEveryType = 860; // Воїни кожного типу
        int totalNumberOfWarriorsLee = warriorsOfEveryType * 3; // Загальна кількість воїнів армії Лі
        int totalAttackValueLee = (warriorsOfEveryType * warriorLee) + (warriorsOfEveryType * archerLee) +
                (warriorsOfEveryType * riderLee); // Загальна кількість атаки армії Лі

        System.out.println("Загальна кілкість воїнів Лі: "  + totalNumberOfWarriorsLee);
        System.out.println("Загальна кількість атаки арміЇ Лі: " + totalAttackValueLee);
        System.out.println();


        int warriorMing = 9;
        int archerMing = 35;
        int riderMing = 12;

        double warriorsOfEveryTypeMing =  warriorsOfEveryType * 1.5; // Воїни кожного типу
        double totalNumberOfWarriorsMing = warriorsOfEveryTypeMing * 3; //Загальна кількість воїнів армії Мінь
        double totalAttackValueMing =  (warriorsOfEveryType * warriorMing) + (warriorsOfEveryType * archerMing) +
                (warriorsOfEveryType + riderMing); // Загальна кількість атаки армії Мінь

        System.out.println("Загальна кілкість воїнів Мінь: " + totalNumberOfWarriorsMing);
        System.out.println("Загальна кількість атаки арміЇ Мінь: " +  totalAttackValueMing);

    }
}
