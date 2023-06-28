package Sem1_Exceptions;

import static Sem1_Exceptions.TaskDZ1.NewArr;
import static Sem1_Exceptions.TaskDZ1.divideNewArr;

public class Main {
    public static void main(String[] args) {
        NewArr(new Integer[]{3,4,5}, new Integer[]{4,5,6}); // вычисляем разность массивов
        // NewArr(new Integer[]{3,4,5}, new Integer[]{4,5,6,7}); // вызываем масиивы не равной длины
        System.out.println("");
        System.out.println(divideNewArr(new Integer[]{6,10,12}, new Integer[]{3,5,6}));
        // System.out.println(divideNewArr(new int[]{6,10,12}, new int[]{0,5,6}));// деление на ноль
    }
}
