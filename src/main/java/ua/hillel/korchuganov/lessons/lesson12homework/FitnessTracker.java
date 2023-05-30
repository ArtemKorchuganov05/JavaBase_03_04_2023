package ua.hillel.korchuganov.lessons.lesson12homework;

public class FitnessTracker {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private String phone;
    private int weight;
    private String bloodPressure;
    private int dailySteps;
    private int age;

    public FitnessTracker(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.age = calculateAge(yearOfBirth);
    }

    private int calculateAge(int yearOfBirth) {
        return 2020 - yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getDailySteps() {
        return dailySteps;
    }

    public void setDailySteps(int dailySteps) {
        this.dailySteps = dailySteps;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + dayOfBirth + "-" + monthOfBirth + "-" + yearOfBirth);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Surname: " + lastName);
        System.out.println("Weight " + weight + " kg");
        System.out.println("Blood pressure: " + bloodPressure);
        System.out.println("Steps per Day: " + dailySteps);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
