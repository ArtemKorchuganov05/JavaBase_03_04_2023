package ua.hillel.korchuganov.lessons.lesson5;


import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть ім'я першої команди: ");
        String nameTeam1 = sc.nextLine();

        System.out.println("Введіть кількість фрагів гравця 1 команди 1: ");
        int player1Team1 = 0;
        if(sc.hasNextInt()){
            player1Team1 = sc.nextInt();
        }else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів гравця 2 команди 1: ");
        int player2Team1 = 0;
        if(sc.hasNextInt()){
            player2Team1 = sc.nextInt();
        }else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів гравця 3 команди 1: ");
        int player3Team1 = 0;
        if(sc.hasNextInt()){
            player3Team1 = sc.nextInt();
        }else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів гравця 4 команди 1: ");
        int player4Team1 = 0;
        if(sc.hasNextInt()){
            player4Team1 = sc.nextInt();
        }else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів гравця 5 команди 1: ");
        int player5Team1 = 0;
        if(sc.hasNextInt()){
            player5Team1 = sc.nextInt();
        }else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        sc.nextLine();

        System.out.println("Введіть ім'я другої команди: ");
        String nameTeam2 = sc.nextLine();

        System.out.println("Введіть кількість фрагів гравця 1 команди 2: ");
        int player1Team2 = 0;
        if(sc.hasNextInt()){
            player1Team2 = sc.nextInt();
        }else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів гравця 2 команди 2: ");
        int player2Team2 = 0;
        if(sc.hasNextInt()){
            player2Team2 = sc.nextInt();
        }else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів гравця 3 команди 2: ");
        int player3Team2 = 0;
        if(sc.hasNextInt()){
            player3Team2 = sc.nextInt();
        }else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів гравця 4 команди 2: ");
        int player4Team2 = 0;
        if(sc.hasNextInt()){
            player4Team2 = sc.nextInt();
        }else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів гравця 5 команди 2: ");
        int player5Team2 = 0;
        if(sc.hasNextInt()){
            player5Team2 = sc.nextInt();
        }else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }


        int resultFragsTeam1 = player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1;
        System.out.println("Загальна кількість балів першої команди: " + resultFragsTeam1);

        int resultFragsTeam2 = player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2;
        System.out.println("Загальна кількість балів другої команди: " + resultFragsTeam2);
        System.out.println();


        double avgFragsTeam1 =(double) (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1) / 5;
        System.out.println("Середня арефмитична кількість балів першої команди: " + avgFragsTeam1);

        double avgFragsTeam2 =(double) (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2) / 5;
        System.out.println("Середня арефмитична кількість балів другої команди: " + avgFragsTeam2);
        System.out.println();

       if (avgFragsTeam1 > avgFragsTeam2){
            System.out.println("Перемогла команда : " + nameTeam1 + " набрала " + resultFragsTeam1 + " балів");
        } else if(avgFragsTeam1 < avgFragsTeam2) {
           System.out.println("Перемогла команда : " + nameTeam2 + " набрала " + resultFragsTeam2 + " балів");
       } else if  (avgFragsTeam1 == avgFragsTeam2) {
           System.out.println("Нічия! " + "Перша команда " + nameTeam1 + " набрала " + resultFragsTeam1 + " балів, " +
                   "друга команда " + nameTeam2 + " набрала " + resultFragsTeam2 + " балів");
       }
    }
}
