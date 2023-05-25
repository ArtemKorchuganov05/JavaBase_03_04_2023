package ua.hillel.korchuganov.lessons.lesson12homework;

public class MainTracker {
    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("John", 10,5,1990, "john@example.com", "1234567890");
        user1.setLastName("Doe");
        user1.setWeight(73.5);
        user1.setBloodPressure("120/80");
        user1.setStepsDay(10000);

        FitnessTracker user2 = new FitnessTracker("Jane", 15,8,1995, "jane@example.com", "0987654321");
        user1.setLastName("Smith");
        user1.setWeight(65.5);
        user1.setBloodPressure("110/70");
        user1.setStepsDay(8000);

        FitnessTracker user3 = new FitnessTracker("Mike", 20,12,1992, "mike@example.com", "1234564390");

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}
