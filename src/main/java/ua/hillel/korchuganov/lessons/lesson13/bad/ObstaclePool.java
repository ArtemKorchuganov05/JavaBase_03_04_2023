package ua.hillel.korchuganov.lessons.lesson13.bad;

public class ObstaclePool {

    void start(ParticipantCat participantCat){
        System.out.println(participantCat.getName() + " start swim");
    }

    public void start(ParticipantDog participantDog) {
        System.out.println(participantDog.getName() + " start swim");
    }
    public void start(ParticipantRabbit participantRabbit) {
        System.out.println(participantRabbit.getName() + " start swim");
    }
}
