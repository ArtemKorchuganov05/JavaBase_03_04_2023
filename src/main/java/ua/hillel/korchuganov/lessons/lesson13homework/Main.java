package ua.hillel.korchuganov.lessons.lesson13homework;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] bands = {
                    new PopMusic(),
                    new RockMusic(),
                    new ClassicMusic()
        };

        for (MusicStyles band:bands){
            band.playMusic();
        }
    }
}
