package ua.hillel.korchuganov.lessons.lesson8;

public class Homework8 {
    public static void main(String[] args) {
        int counter = 0;


        //version1
//        for (int i = 1;  counter < 100; i++) {
//            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("9")) {
//                continue;
//            }
//            System.out.println("shuttle number: " + i);
//            counter++;
//        }


        for (int i = 145; counter < 100 ; i++) {
            boolean ok = true;

            int number = i;
            while (number    > 0){
                int result = number % 10;

                if(result == 4 || result == 9){
                    ok = false;
                    break;
                }
                number /= 10;

            }
            if(ok) {
                System.out.println("shuttle number: " + i);
                counter++;
            }
        }

        System.out.println("count shuttle: " + counter);
    }
}
