package ua.hillel.korchuganov.lessons.lesson4.lesson9;

public class Main {
    public static void main(String[] args) {
//        int[][] array = new int[3][22];

//        array[0][0] = 77;
//        array[2][4] = 99;

//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);


        //System.out.println(Arrays.toString(array));
        // System.out.println(Arrays.deepToString(array));

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int[] arr = {1, 2, 3, 4, 5};

//        int[][] array = {
//                {1,2,3,4,5},
//                {6,7,8,9,10},
//                {11,12,13,14,15}
//        };
//
//        System.out.println(array[1][2]);
////        System.out.println(Arrays.toString(array));
//
//                for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        int[] row1 = array[1];
//
//        for (int i = 0; i < row1.length; i++) {
//            System.out.print(row1[i] + " ");
//        }
//        row1[0] = 100;
//        System.out.println();
//
//        for (int i = 0; i < row1.length; i++) {
//            System.out.print(row1[i] + "    ");
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int[][] array = {
//                {1, 2, 3},
//                {2},
//                {65, 4, 3, 1, 4, 6, 7, 45},
//                {6,6,6,6,6},
//                {4, 4, 4, 4}
//            };

//            int[] temp = array[0];
//            array[0] = array[1];
//            array[1] = temp;


//            int[][][] array = new int[3][2][4];
//            int[][][] array = {
//                    {
//                            {18,28,18,28},
//                            {45,90,45,0}
//                    },
//                    {
//                            {7,125,500,5},
//                            {0,11,25,30}
//                    },
//                    {
//                            {81,17,19,55},
//                            {1,7,38,11}
//                    }
//            };
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//
//            System.out.println(Arrays.toString(array[0][1]));
//        }
//                for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][][][] array =
//                {
//                        {
//                            {18, 28, 18, 28}
//                        },
//                        {
//
//                        }    {45, 90, 45, 0}
//                         },
//                    {
//                            {7,125,500,5},
//                            {0,11,25,30}
//                    },
//                    {
//                            {81,17,19,55},
//                            {1,7,38,11}
//                    }
    }




    public void task2(){
        char[][] chess = new char[8][8];

        for (int i = 0; i < chess.length; i ++) {
            for (int j = 0; j < chess[i].length; j ++) {
//                if((i + j % 2) == 0){
//                    chess[i][j] = 'B';
//                }else {
//                    chess[i][j] = 'W';
//                }
                chess[i][j] = ((i + j % 2) == 0) ? 'B' : 'W';
                System.out.print(chess[i][j] + "\t");

            }
        }
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                System.out.print(chess[i][j] + "\t");
//            }
//            System.out.println();
//        }
    }

    public void task1() {
//        int[][] array = new int[5][5];
////        for (int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array[i].length; j++) {
////                System.out.print(array[i][j] + "\t");
////            }
////            System.out.println();
////        }
//
//        //version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//
//            }
//
//        }

        //  version 2
//        for (int i = 0; i < array.length; i++) {
//            array[i][i] = 1;
//        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        for (int i = array.length - 1; i >= 0; i--) {
//            for (int j = 0; j < array.length; j++) {
//                array[i][j] = 1;
//          }


        // version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if(i + j == array.length - 1){
//                    array[i][j] = 1;
//                }
//            }
//        }

        // version 2
//        for (int i = 0, j = array.length - 1; i < array.length ; i++, j--) {
//            array[i][j] = 1;
//        }

        // version 3
//        for (int i = 0; i < array.length; i++) {
//            array[i][array[i].length - 1 - i] = 1;
//            //0 4
//            //1 3
//            //2 2
//        }
//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                sum += array[i][j];
//            }
//        }
//        System.out.println("avg = " +(double) sum / (array.length * array[0].length));


//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[i].length; j++) {
//                    System.out.print(array[i][j] + "\t");
//                }
//                System.out.println();
//            }
    }
}

