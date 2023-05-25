package ua.hillel.korchuganov.lessons.lesson13.good.obstacle;

import ua.hillel.korchuganov.lessons.lesson13.good.participant.Participant;

public class ObstacleWall extends Obstacle{


    @Override
    public void start(Participant participant) {
        System.out.println(participant.getName() + " start jump");
    }
}

