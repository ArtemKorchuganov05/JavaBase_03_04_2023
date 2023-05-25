package ua.hillel.korchuganov.lessons.lesson12homework;

public class FitnessTracker {
    private String firstName;
    private String lastName;
    private int birthday;
    private int birthMonth;
    private int birthYear;
    private String email;
    private String phone;
    private String surname;
    private double weight;
    private String bloodPressure;
    private int stepsDay;
    private int age;


    public FitnessTracker(String firstName, int birthday, int birthMonth, int birthYear, String email, String phone) {
        this.firstName = firstName;
        this.birthday = birthday;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        calculateAge();
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsDay(int stepsDay) {
        this.stepsDay = stepsDay;
    }

    public void calculateAge(){
        int currentYear = 2023;
        age = currentYear - birthYear;

        if(birthMonth > 5 || (birthMonth == 5 && birthday > 25)) {
            age--;
        }
    }

    public void printAccountInfo(){
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + birthday +  "-" + birthMonth + "-" + birthYear);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Surname" + surname);
        System.out.println("Weight " +  weight + " kg");
        System.out.println("Blood pressure: " + bloodPressure);
        System.out.println("Steps per Day: " +  stepsDay);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
