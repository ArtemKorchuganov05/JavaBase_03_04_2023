package ua.hillel.korchuganov.lessons.lesson11;

public class Airplane {
    String type;
    String name;
    int firstClassPassengers;
    int secondClassPassengers;

     Airplane(String type, String name) {
        this.type = type;
        this.name = name;

         System.out.println("винищувач тип: " + this.type + " " + this.name);
    }

    Airplane(String type, String name, int secondClassPassengers) {
        this.type = type;
        this.name = name;
        this.secondClassPassengers = secondClassPassengers;

        System.out.println("пасажирський без бізнес класу тип: " + this.type
                + " " + this.name
                + " кільк. пасажирів 2-го класу: " + this.secondClassPassengers);
    }

     Airplane(String type, String name, int secondClassPassengers, int firstClassPassengers) {
        this.type = type;
        this.name = name;
        this.secondClassPassengers = secondClassPassengers;
        this.firstClassPassengers = firstClassPassengers;

         System.out.println("пасажирський з бізнес класом тип: " + this.type
                 + " " + this.name
                 + " кільк. пасажирів 2-го класу: " + this.secondClassPassengers
                 + " кільк. пасажирів 1-го класу: " + this.firstClassPassengers);

    }
}
