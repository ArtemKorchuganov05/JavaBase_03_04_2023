package ua.hillel.korchuganov.lessons.lesson11;

public class AirCraftFactory {
    public static void main(String[] args) {
        Airplane jetF52 = new Airplane("Jet","F52");
        Airplane boeing747withoutFirstClass = new Airplane("Boeing","747",300);
        Airplane boeing747withFirstClass = new Airplane("Boeing","747",300,25);
    }
}
