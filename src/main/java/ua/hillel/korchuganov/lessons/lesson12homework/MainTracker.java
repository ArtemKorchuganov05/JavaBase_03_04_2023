package ua.hillel.korchuganov.lessons.lesson12homework;

public class MainTracker {
    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("John", "Doe", 15, 6, 1990, "john.doe@example.com", "1234567890");
        user1.setWeight(75);
        user1.setBloodPressure("120/80");
        user1.setDailySteps(8000);

        FitnessTracker user2 = new FitnessTracker("Jane", "Smith", 25, 9, 1985, "jane.smith@example.com", "9876543210");
        user2.setWeight(62);
        user2.setBloodPressure("110/70");
        user2.setDailySteps(10000);

        FitnessTracker user3 = new FitnessTracker("Alice", "Johnson", 10, 3, 1995, "alice.johnson@example.com", "5555555555");
        user3.setWeight(68);
        user3.setBloodPressure("130/85");
        user3.setDailySteps(6000);

        // Вивід інформації про користувачів
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}
