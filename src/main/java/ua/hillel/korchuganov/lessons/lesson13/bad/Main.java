package ua.hillel.korchuganov.lessons.lesson13.bad;

public class Main {
    public static void main(String[] args) {

        ObstaclePool obstaclePool = new ObstaclePool();
        ObstacleWall obstacleWall = new ObstacleWall();

        ParticipantCat participantCat = new ParticipantCat("Tom");
        ParticipantDog participantDog = new ParticipantDog("Bobik");
        ParticipantDog participantRabbit = new ParticipantDog("Bunny");

        obstaclePool.start(participantCat);
        obstaclePool.start(participantDog);
        obstaclePool.start(participantRabbit);

        obstacleWall.start(participantCat);
        obstacleWall.start(participantDog);
        obstacleWall.start(participantRabbit);
    }
}
