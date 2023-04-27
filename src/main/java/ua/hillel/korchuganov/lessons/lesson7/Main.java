package ua.hillel.korchuganov.lessons.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] array = new int[5];
//
//        array[0] = 9;
//        array[1] = 1;
//        array[2] = 2;
//        array[3] = 3;
//        array[4] = 4;

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//
//        System.out.println(array.length);
//
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == 3 || array[i] == 4){
//                array[i] = 77;
//            }
//            System.out.println(array[i]);
//        }

//        for (int value : array) {
//            System.out.println(value);
//
//        }

//        System.out.println(Arrays.toString(array));

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));

            array2[0] = 99;
            System.out.println();

            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));


    }

        static void task2 () {
            //        int[] array = new int[5];
////        int array2[] = new int[5];
//        int[] array3 = {1,2,3,4,5,6,7,8};
////        int[] array4 = new int[]{1,2,3,4,5,6,7,8};
////       int[] array5 = new int[-1]; // NegativeArraySizeException
//       int[] array6 = new int[0];

//            int[] people = {6, 44, 98, 44, 22, 33, 55, 22, 98, 10};

//            int min = people[0];
//        for (int i = 0; i < people.length; i++) {
//            if(min > people[i]){
//                min = people[i];
//            }
//        }
//        System.out.println("min = " + min);

//        int[] people = new int[10];
//
//        for (int i = 0; i < people.length; i++) {
//            people[i] = (int) (Math.random() * 101);
//        }
//        System.out.println(Arrays.toString(people));
//

            //Version 1
//        int max = people[0];
//        for (int i = 0; i < people.length; i++) {
////            if (max < people[i]) {
////                max = people[i];
////            }
//            max = (max >= people[i ]) ? max : people[i];
////            max = Math.max(max, people[i]);
//        }
//        System.out.println("max chance = " + max);


            // version 2
//            int[] people = {6, 44, 98, 44, 22, 33, 55, 22, 98, 10};
//
//            int max = people[0];
//
//            for (int i = 0; i < people.length; i++) {
//                max = Math.max(max, people[i]);
//            }
//
//            for (int i = 0; i < people.length; i++) {
//                if (max == people[i]) {
//                    System.out.println("chance = " + max + ", index: " + i);
//                }
//            }
        }
        static void task3(){

////        int[] team = new int[10];
////        for (int i = 0; i < team.length; i++) {
////            team[i] = (int) (Math.random() * 11);
////        }
//
//
////        System.out.println(Arrays.toString(team));
////
////        int[] array1 = new int[team.length / 2];
////        int[] array2 = new int[team.length / 2];
////
////        int iterator1 = 0;
////        int iterator2 = 0;
////
////        for (int i = 0; i < team.length; i++) {
////            if (team[i] % 2 == 0) {
////                System.out.println(" team1 " + i + " = " + team[i]);
////
////                array1[iterator1] = team[i];
////                iterator1++;
////            } else {
////                array1[iterator2] = team[i];
////                iterator2++;
////            }
////            System.out.println(Arrays.toString(array1));
////            System.out.println(Arrays.toString(array2));
////
////            int sumTeam1 = 0;
////            int sumTeam2 = 0;
////
////            for (int i1 = 0; i < array1.length; i++) {
////                sumTeam1 += array1[i1];
////            }
////            for (int i1 = 0; i < array2.length; i++) {
////                sumTeam2 += array2[i1];
////            }
////            System.out.println(sumTeam1);
////            System.out.println(sumTeam2);
////
////            if (sumTeam1 > sumTeam2) {
////                System.out.println("Team1 Win");
////            } else if (sumTeam1 < sumTeam2) {
////                System.out.println("Team2 Win");
////            } else {
////                System.out.println("Draw");
////            }
////        }
////
////    }
////        static void task1 () {
////            int[] array = new int[10];
////            for (int i = 0; i < array.length; i++) {
////                array[i] = (int) (Math.random() * 11);
////            }
////
////            for (int i = 0; i < array.length; i++) {
////
//////            System.out.println("index = " + i);
//////            System.out.println("value = " + array[i]);
//////            System.out.println();
////
////                if (i == array.length - 1) {
////                    System.out.println(array[i]);
////                } else {
////                    System.out.print(array[i] + ", ");
////                }
////            }
////        }
//
//        int[] team = new int[10];
//        for (int i = 0; i < team.length; i++) {
//            team[i] = (int) (Math.random() * 11);
//        }
//        System.out.println(Arrays.toString(team));
//        int sumTeam1 = 0;
//        int sumTeam2 = 0;
//
//        for (int i = 0; i < team.length; i++) {
//            if (i % 2 == 0) {
//                sumTeam1 += team[i];
//            } else {
//                sumTeam2 += team[i];
//            }
//        }
//
//        System.out.println("sumTeam1 = " + sumTeam1);
//        System.out.println("sumTeam2 = " + sumTeam2);
//
//        if (sumTeam1 > sumTeam2) {
//                System.out.println("Team1 Win");
//            } else if (sumTeam1 < sumTeam2) {
//                System.out.println("Team2 Win");
//            } else {
//                System.out.println("Draw");
//            }
        }
    }
