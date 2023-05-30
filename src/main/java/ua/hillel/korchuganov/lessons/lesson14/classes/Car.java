package ua.hillel.korchuganov.lessons.lesson14.classes;

public class Car {

    private static String modelName;
    private Engine engine;

    public Car(String modelName, double volume) {
        this.modelName = modelName;
        this.engine = new Engine(volume);
    }

    public Car(String modelName) {
        this.modelName = modelName;
    }



    private void demo(){

           if(true) {
               class LocalClass {
                   int x;
                   int y;
                   int z;

                   void localClassMethod() {
                       System.out.println("localClassMethod");
                   }
               }
           }
    }

    public class Engine {

        double volume;
        static int staticInt = 20;

        public Engine(double volume) {
            this.volume = volume;
        }

        void start() {
            System.out.println(modelName + " start");
            demo();
        }

        void stop() {
            System.out.println("stop");
        }
    }

    static class Wheel{

        static double staticObemTusky = 20;
        double obemTusky = 10;

        static void demoNonStaticMethod() {
            System.out.println("demoNonStaticMethod");
            System.out.println(modelName);
        }
        static void demoStaticMethod() {
            System.out.println("demoStaticMethod");
            System.out.println(modelName);
        }

    }
}
