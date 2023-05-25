package ua.hillel.korchuganov.lessons.lesson13.good;

import ua.hillel.korchuganov.lessons.lesson13.good.obstacle.Obstacle;
import ua.hillel.korchuganov.lessons.lesson13.good.obstacle.ObstaclePool;
import ua.hillel.korchuganov.lessons.lesson13.good.obstacle.ObstacleWall;
import ua.hillel.korchuganov.lessons.lesson13.good.participant.Participant;
import ua.hillel.korchuganov.lessons.lesson13.good.participant.ParticipantCat;
import ua.hillel.korchuganov.lessons.lesson13.good.participant.ParticipantDog;
import ua.hillel.korchuganov.lessons.lesson13.good.participant.ParticipantRabbit;

public class Main {
     public static void main(String[] args) {

//        ObstaclePool obstaclePool = new ObstaclePool();
//        ObstacleWall obstacleWall = new ObstacleWall();
//
//        ParticipantCat participantCat = new ParticipantCat("Tom");
//        ParticipantDog participantDog = new ParticipantDog("Bobik");
//        ParticipantDog participantRabbit = new ParticipantDog("Bunny");
//
//        obstaclePool.start(participantCat);
//        obstaclePool.start(participantDog);
//        obstaclePool.start(participantRabbit);
//
//        obstacleWall.start(participantCat);
//        obstacleWall.start(participantDog);
//        obstacleWall.start(participantRabbit);

         Obstacle[] obstacles = {
                 new ObstaclePool(),
                 new ObstacleWall()
         };

         Participant[] participants = {
                 new ParticipantDog("Bobik"),
                 new ParticipantCat("Tom"),
         };

         for(Obstacle obstacle : obstacles){
             for(Participant participant : participants){
                 obstacle.start(participant);
             }
         }

//        Participant participantCat = new ParticipantCat("Tom");
//        System.out.println(participantCat.getClass());
//
//
//    }

//    static void demo(Participant participant){
//        participant.getName();
//
//        if(participant instanceof  ParticipantCat){
//            ((ParticipantCat) participant).demoMethodCat();
//        }

    }
}
