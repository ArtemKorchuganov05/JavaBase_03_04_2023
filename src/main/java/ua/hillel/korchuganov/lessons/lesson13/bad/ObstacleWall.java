package ua.hillel.korchuganov.lessons.lesson13.bad;

public class ObstacleWall {

    void start(ParticipantCat participantCat){
        System.out.println(participantCat.getName() + " start jump");
    }

    public void start(ParticipantDog participantDog) {
        System.out.println(participantDog.getName() + " start jump");
    }
    public void start(ParticipantRabbit participantRabbit) {
        System.out.println(participantRabbit.getName() + " start jump");
    }
}
