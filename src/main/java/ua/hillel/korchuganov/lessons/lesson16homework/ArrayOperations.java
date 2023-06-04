package ua.hillel.korchuganov.lessons.lesson16homework;

public class ArrayOperations {
    public static double average(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        return (double) sum / nums.length;
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        double average = ArrayOperations.average(array);
        System.out.println("Average: " + average);
    }
}
