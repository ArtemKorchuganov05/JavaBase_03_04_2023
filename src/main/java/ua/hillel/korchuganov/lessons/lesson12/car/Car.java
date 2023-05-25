package ua.hillel.korchuganov.lessons.lesson12.car;

public class Car {
    public String modelName;
    private double fuelStatus;
    boolean isStart;
    private String key;



    public Car(String modelName) {
        this.modelName = modelName;
    }
    public void start() {
        startElectronicSystem();
        startFuelSystem();
        startGPS();
    }

    private void startElectronicSystem() {
        System.out.println("startElectronicSystem");
    }

    private void startFuelSystem() {
        System.out.println("startFuelSystem");
    }

    private void startGPS() {
        System.out.println("startGPS");
    }

//    public void setFuelStatus(double fuelStatus) {
//        if (fuelStatus <= 0 || fuelStatus > 100) {
//            System.out.println("WRONG DATA!!!");
//        } else {
//            this.fuelStatus = fuelStatus;
//        }
//    }
//
//    public double getFuelStatus(){
//
//        return fuelStatus;
//    }


    public String getModelName() {
        return modelName;
    }

    public void setFuelStatus(double fuelStatus) {
        this.fuelStatus = fuelStatus;
    }
}