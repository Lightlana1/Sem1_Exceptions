package Sem1_Exceptions;

import java.util.ArrayList;

public class TaskDZ1 {
    public static void NewArr(Integer[] arr1, Integer[] arr2){
        String diffArr = "";
        int result = 0;


        if (arr1.length != arr2.length){
            throw new RuntimeException ("Массивы не равны!");
        }
        else {
            for (int i = 0; i < arr1.length; i++) {
                result = arr1[i] - arr2[i];
                diffArr = diffArr + " " + result;
            }
            System.out.println("Полученный массив:" + diffArr );
        }
    }

    public static ArrayList<Float> divideNewArr(Integer[] arr1, Integer[] arr2){
        ArrayList<Float> result = new ArrayList<>();
        if (arr1.length != arr2.length){
            throw new RuntimeException ("Массивы не равны!");
        } else if (arr1.length < 1 && arr2.length < 1) {
            throw new RuntimeException ("Один из массивов пуст!");
        }
        else {
            for (int i = 0; i < arr1.length; i++) {
                if(arr2[i] != 0){
                    result.add((float) (arr1[i]/arr2[i]));
                }
                else {
                    throw new RuntimeException("Деление на ноль");
                }
            }
            return result;
        }

    }
}
