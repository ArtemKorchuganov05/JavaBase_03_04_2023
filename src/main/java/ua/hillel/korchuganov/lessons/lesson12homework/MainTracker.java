package ua.hillel.korchuganov.lessons.lesson12homework;

public class MainTracker {
    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("John", 10,5,1990, "john@example.com", "1234567890");
        user1.setLastName("Doe");
        user1.setWeight(73.5);
        user1.setBloodPressure("120/80");
        user1.setStepsDay(10000);

        FitnessTracker user2 = new FitnessTracker("Jane", 15,8,1995, "jane@example.com", "0987654321");
        user2.setLastName("Smith");
        user2.setWeight(65.5);
        user2.setBloodPressure("110/70");
        user2.setStepsDay(8000);

        FitnessTracker user3 = new FitnessTracker("Mike", 20,12,1992, "mike@example.com", "1234564390");

        user3.setLastName("Le");
        user3.setWeight(68.5);
        user3.setBloodPressure("100/70");
        user3.setStepsDay(9000);


        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}