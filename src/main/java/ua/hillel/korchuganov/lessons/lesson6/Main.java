package ua.hillel.korchuganov.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        for (int i = 0; i <  5; i++) {
//            System.out.println("Hello");
//        }
//
//        for (int i = 10; i >=  5; i--) {
//            System.out.println(i);
//        }



//        for (byte i = 0; i < 200; i++) {
//            System.out.println(i);
//
//
//        }

//        for (int i = 1; ; i++) {
//
//            if(i > 10){
//                continue;
//            }
//            if(i > 10){
//                break;
//            }
//            System.out.println(i);
//        }

        //version 1
//        for (int i = 0; i < 21; i += 2) {
//            System.out.println(i);
//        }

        //version2
//        for (int i = 0; i < 21; i++) {
//            if(i % 2 != 0){
//                continue;
//            }
//            System.out.println(i);
//        }

//        int num1 = 1;
//        int num2 = 1;
//        int sum;
//
//        System.out.print(num1 + " " + num2 + " ");
//
//        for (int i = 0; i < 9 ; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//
//            num1 = num2;
//            num2 = sum;
//
//        }

//        for (int i = 0, j = 10 ; i < 10 && j > 5; i++, j--) {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//            System.out.println();
//            System.out.println();
//        }

        //WHILE


//        int i  = 0;
//        while(true){
//
//            if( i == 5){
//                continue;
//            }
//
//            if(i > 10){
//                break;
//            }
//
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//
//        do{
//            System.out.println("Yes");
//            i++;
//        } while (i < 4);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter integer from 10 to 20");
//


       // Check
//        while(true) {
//            if (scanner.hasNextInt()) {
//                int userValue = scanner.nextInt();
//
//                if(userValue >= 10 && userValue <= 20) {
//                    System.out.println(" user value = " + userValue);
//                    break;
//                }else{
//                    System.out.println("Enter integer from 10 to 20");
//                }
//            } else {
//                System.out.println("wrong data! try again!");
//            }
//            scanner.nextLine();
//        }

//        int i = 10;
//
//        while(true){
//            int random = (int) (Math.random() * 101);
//            System.out.println("random = " + random);
//
//            if (random >= 85 && random <=  100){
//                System.out.println("Booom!");
//                break;
//            }
//
//            System.out.println(i);
//
//
//            if(i == 0){
//                System.out.println("boom");
//                break;
//            }
//
//            i--;
//        }
//        int chance = 101;
//        int j = 0;
//
//        for (int i = 0; i < 100; i++) {
//            j++;
//            int random = (int) (Math.random() * chance);
//            System.out.println("random = " + random);
//
//            if (random == 0 || random == 1){
//                System.out.println("JACKPOT WIN!");
//                break;
//            }
//
//            if(j == 10){
//                chance -= 10;
//                j = 0;
//            }
//        }
//        for (int i = 0; i <= 10; i++) {
//            if(i == 4 || i == 9){
//                continue;
//            }
//            System.out.println(i);
//            int x = 29;
//            System.out.println( x / 10);
//            System.out.println( x % 10);
//        }
            int number = 140;
            int first = number / 100;
            int second = (number / 10) % 10;
            int third = number % 10;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
