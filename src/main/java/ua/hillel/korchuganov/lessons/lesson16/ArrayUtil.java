package ua.hillel.korchuganov.lessons.lesson16;

public class ArrayUtil {

    public static int getIndexElement(int[] array, int element){
        if(array == null){
            return -3;
        }

        if (array.length == 0){
            return -2;
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] == element){
                return i;
            }
        }

        return -1;
    }
}
